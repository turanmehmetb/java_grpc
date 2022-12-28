package grpc.generate;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: carService.proto")
public final class CarRentalServiceGrpc {

  private CarRentalServiceGrpc() {}

  public static final String SERVICE_NAME = "grpc.generate.CarRentalService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<grpc.generate.ListRequest,
      grpc.generate.ListResponse> METHOD_LIST =
      io.grpc.MethodDescriptor.<grpc.generate.ListRequest, grpc.generate.ListResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.generate.CarRentalService", "list"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpc.generate.ListRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpc.generate.ListResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<grpc.generate.GetRequest,
      grpc.generate.GetResponse> METHOD_GET =
      io.grpc.MethodDescriptor.<grpc.generate.GetRequest, grpc.generate.GetResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.generate.CarRentalService", "get"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpc.generate.GetRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpc.generate.GetResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<grpc.generate.AddRequest,
      grpc.generate.AddResponse> METHOD_ADD =
      io.grpc.MethodDescriptor.<grpc.generate.AddRequest, grpc.generate.AddResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.generate.CarRentalService", "add"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpc.generate.AddRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpc.generate.AddResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<grpc.generate.CancelRequest,
      grpc.generate.CancelResponse> METHOD_CANCEL =
      io.grpc.MethodDescriptor.<grpc.generate.CancelRequest, grpc.generate.CancelResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpc.generate.CarRentalService", "cancel"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpc.generate.CancelRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              grpc.generate.CancelResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CarRentalServiceStub newStub(io.grpc.Channel channel) {
    return new CarRentalServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CarRentalServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CarRentalServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CarRentalServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CarRentalServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CarRentalServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void list(grpc.generate.ListRequest request,
        io.grpc.stub.StreamObserver<grpc.generate.ListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST, responseObserver);
    }

    /**
     */
    public void get(grpc.generate.GetRequest request,
        io.grpc.stub.StreamObserver<grpc.generate.GetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET, responseObserver);
    }

    /**
     */
    public void add(grpc.generate.AddRequest request,
        io.grpc.stub.StreamObserver<grpc.generate.AddResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD, responseObserver);
    }

    /**
     */
    public void cancel(grpc.generate.CancelRequest request,
        io.grpc.stub.StreamObserver<grpc.generate.CancelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CANCEL, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                grpc.generate.ListRequest,
                grpc.generate.ListResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            METHOD_GET,
            asyncUnaryCall(
              new MethodHandlers<
                grpc.generate.GetRequest,
                grpc.generate.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            METHOD_ADD,
            asyncUnaryCall(
              new MethodHandlers<
                grpc.generate.AddRequest,
                grpc.generate.AddResponse>(
                  this, METHODID_ADD)))
          .addMethod(
            METHOD_CANCEL,
            asyncUnaryCall(
              new MethodHandlers<
                grpc.generate.CancelRequest,
                grpc.generate.CancelResponse>(
                  this, METHODID_CANCEL)))
          .build();
    }
  }

  /**
   */
  public static final class CarRentalServiceStub extends io.grpc.stub.AbstractStub<CarRentalServiceStub> {
    private CarRentalServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarRentalServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarRentalServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarRentalServiceStub(channel, callOptions);
    }

    /**
     */
    public void list(grpc.generate.ListRequest request,
        io.grpc.stub.StreamObserver<grpc.generate.ListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(grpc.generate.GetRequest request,
        io.grpc.stub.StreamObserver<grpc.generate.GetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void add(grpc.generate.AddRequest request,
        io.grpc.stub.StreamObserver<grpc.generate.AddResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancel(grpc.generate.CancelRequest request,
        io.grpc.stub.StreamObserver<grpc.generate.CancelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CANCEL, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CarRentalServiceBlockingStub extends io.grpc.stub.AbstractStub<CarRentalServiceBlockingStub> {
    private CarRentalServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarRentalServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarRentalServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarRentalServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.generate.ListResponse list(grpc.generate.ListRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST, getCallOptions(), request);
    }

    /**
     */
    public grpc.generate.GetResponse get(grpc.generate.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET, getCallOptions(), request);
    }

    /**
     */
    public grpc.generate.AddResponse add(grpc.generate.AddRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD, getCallOptions(), request);
    }

    /**
     */
    public grpc.generate.CancelResponse cancel(grpc.generate.CancelRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CANCEL, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CarRentalServiceFutureStub extends io.grpc.stub.AbstractStub<CarRentalServiceFutureStub> {
    private CarRentalServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarRentalServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarRentalServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarRentalServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.generate.ListResponse> list(
        grpc.generate.ListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.generate.GetResponse> get(
        grpc.generate.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.generate.AddResponse> add(
        grpc.generate.AddRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.generate.CancelResponse> cancel(
        grpc.generate.CancelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CANCEL, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_ADD = 2;
  private static final int METHODID_CANCEL = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CarRentalServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CarRentalServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((grpc.generate.ListRequest) request,
              (io.grpc.stub.StreamObserver<grpc.generate.ListResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((grpc.generate.GetRequest) request,
              (io.grpc.stub.StreamObserver<grpc.generate.GetResponse>) responseObserver);
          break;
        case METHODID_ADD:
          serviceImpl.add((grpc.generate.AddRequest) request,
              (io.grpc.stub.StreamObserver<grpc.generate.AddResponse>) responseObserver);
          break;
        case METHODID_CANCEL:
          serviceImpl.cancel((grpc.generate.CancelRequest) request,
              (io.grpc.stub.StreamObserver<grpc.generate.CancelResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class CarRentalServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.generate.CarService.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CarRentalServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CarRentalServiceDescriptorSupplier())
              .addMethod(METHOD_LIST)
              .addMethod(METHOD_GET)
              .addMethod(METHOD_ADD)
              .addMethod(METHOD_CANCEL)
              .build();
        }
      }
    }
    return result;
  }
}
