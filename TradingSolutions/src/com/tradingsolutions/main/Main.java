package com.tradingsolutions.main;

import com.ib.client.EClientSocket;
import com.ib.client.EJavaSignal;
import com.ib.client.EReaderSignal;
import com.tradingsolutions.main.api.IBDatastore;
import com.tradingsolutions.main.api.IBHandler;
import com.tradingsolutions.main.api.IBReceiver;

public class Main {
	
	
	public static void main(String[] args) {
		
		EReaderSignal readerSignal = new EJavaSignal();

        IBDatastore ibDatastore = new IBDatastore();

        IBReceiver ibReceiver = new IBReceiver(ibDatastore);
        EClientSocket clientSocket = new EClientSocket(ibReceiver, readerSignal);
        IBHandler ibHandler = new IBHandler(clientSocket, ibDatastore);

        try
        {
            ibHandler.connect();

            // Wait for nextValidId
            for (int i=0; i<10; i++) {
                if (ibDatastore.getNextValidId() != null)
                    break;

                Thread.sleep(1000);
            }

            if (ibDatastore.getNextValidId() == null)
                throw new Exception("Didn't get a valid id from IB");

            // From here you can add the logic of your application
            
            ibHandler.subscribeQuoteData(0, "AAPL", "AMEX");
            
        }
        catch(Exception ex)
        {
            System.err.println(ex);
        }
        finally
        {
            ibHandler.disconnect();
            System.exit(0);
        }		
	}
}
