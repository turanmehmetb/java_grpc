package grpc.server;

import java.util.List;

import grpc.generate.AddRequest;
import grpc.generate.AddResponse;
import grpc.generate.CancelRequest;
import grpc.generate.CancelResponse;
import grpc.generate.CarRentalServiceGrpc.CarRentalServiceImplBase;
import grpc.generate.GetRequest;
import grpc.generate.GetResponse;
import grpc.generate.ListRequest;
import grpc.generate.ListResponse;
import grpc.generate.Reservation;
import io.grpc.stub.StreamObserver;

public class CarRentalServiceImpl extends CarRentalServiceImplBase {

	
	CarRentalRepository repository;
	
	public CarRentalServiceImpl() {
		repository = new CarRentalRepository();
	}
	
	@Override
	public void list(ListRequest request, StreamObserver<ListResponse> responseObserver) {
		
		List<Reservation> reservations = repository.getReservations();
		ListResponse response = reservations != null ? ListResponse.newBuilder().addAllReservations(repository.getReservations()).build() : ListResponse.newBuilder().clearReservations().build();
		responseObserver.onNext(response);
        responseObserver.onCompleted();
        
	}
	
	@Override
	public void get(GetRequest request, StreamObserver<GetResponse> responseObserver) {
		
		int reservationId = request.getReservationId();
		
		Reservation reservation = repository.getReservation(reservationId);	
		GetResponse response = reservation != null ? GetResponse.newBuilder().setReservation(reservation).build() : GetResponse.newBuilder().clearReservation().build();
		responseObserver.onNext(response);
        responseObserver.onCompleted();
        
	}
	
	@Override
	public void add(AddRequest request, StreamObserver<AddResponse> responseObserver) {
		
		Reservation reservation = request.getReservation();
		
		Integer reservationId = repository.addReservation(reservation);
		AddResponse response = reservationId != null ? AddResponse.newBuilder().setReservationId(reservationId).build() : AddResponse.newBuilder().clearReservationId().build();
		responseObserver.onNext(response);
        responseObserver.onCompleted();
        
	}
	
	@Override
	public void cancel(CancelRequest request, StreamObserver<CancelResponse> responseObserver) {
		
		int reservationId = request.getReservationId();
		
		Integer cancelledReservationId = repository.deleteReservation(reservationId);
		CancelResponse response = cancelledReservationId != null ? CancelResponse.newBuilder().setReservationId(cancelledReservationId).build() : CancelResponse.newBuilder().clearReservationId().build();
		responseObserver.onNext(response);
        responseObserver.onCompleted();
        
	}
	
}
