package grpc.server;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class CarRentalServer {
	  public static void main(String[] args) throws IOException, InterruptedException {
	        Server server = ServerBuilder
	          .forPort(8080)
	          .addService(new CarRentalServiceImpl()).build();

	        server.start();
	        server.awaitTermination();
	    }
}
