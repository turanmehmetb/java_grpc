// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: carService.proto

package grpc.generate;

/**
 * Protobuf type {@code grpc.generate.AddRequest}
 */
public  final class AddRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.generate.AddRequest)
    AddRequestOrBuilder {
  // Use AddRequest.newBuilder() to construct.
  private AddRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AddRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            grpc.generate.Reservation.Builder subBuilder = null;
            if (reservation_ != null) {
              subBuilder = reservation_.toBuilder();
            }
            reservation_ = input.readMessage(grpc.generate.Reservation.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(reservation_);
              reservation_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return grpc.generate.CarService.internal_static_grpc_generate_AddRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.generate.CarService.internal_static_grpc_generate_AddRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.generate.AddRequest.class, grpc.generate.AddRequest.Builder.class);
  }

  public static final int RESERVATION_FIELD_NUMBER = 1;
  private grpc.generate.Reservation reservation_;
  /**
   * <code>.grpc.generate.Reservation reservation = 1;</code>
   */
  public boolean hasReservation() {
    return reservation_ != null;
  }
  /**
   * <code>.grpc.generate.Reservation reservation = 1;</code>
   */
  public grpc.generate.Reservation getReservation() {
    return reservation_ == null ? grpc.generate.Reservation.getDefaultInstance() : reservation_;
  }
  /**
   * <code>.grpc.generate.Reservation reservation = 1;</code>
   */
  public grpc.generate.ReservationOrBuilder getReservationOrBuilder() {
    return getReservation();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (reservation_ != null) {
      output.writeMessage(1, getReservation());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (reservation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getReservation());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof grpc.generate.AddRequest)) {
      return super.equals(obj);
    }
    grpc.generate.AddRequest other = (grpc.generate.AddRequest) obj;

    boolean result = true;
    result = result && (hasReservation() == other.hasReservation());
    if (hasReservation()) {
      result = result && getReservation()
          .equals(other.getReservation());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasReservation()) {
      hash = (37 * hash) + RESERVATION_FIELD_NUMBER;
      hash = (53 * hash) + getReservation().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.generate.AddRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.generate.AddRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.generate.AddRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.generate.AddRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.generate.AddRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.generate.AddRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.generate.AddRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.generate.AddRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.generate.AddRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.generate.AddRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.generate.AddRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.generate.AddRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(grpc.generate.AddRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code grpc.generate.AddRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.generate.AddRequest)
      grpc.generate.AddRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.generate.CarService.internal_static_grpc_generate_AddRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.generate.CarService.internal_static_grpc_generate_AddRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.generate.AddRequest.class, grpc.generate.AddRequest.Builder.class);
    }

    // Construct using grpc.generate.AddRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (reservationBuilder_ == null) {
        reservation_ = null;
      } else {
        reservation_ = null;
        reservationBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.generate.CarService.internal_static_grpc_generate_AddRequest_descriptor;
    }

    public grpc.generate.AddRequest getDefaultInstanceForType() {
      return grpc.generate.AddRequest.getDefaultInstance();
    }

    public grpc.generate.AddRequest build() {
      grpc.generate.AddRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public grpc.generate.AddRequest buildPartial() {
      grpc.generate.AddRequest result = new grpc.generate.AddRequest(this);
      if (reservationBuilder_ == null) {
        result.reservation_ = reservation_;
      } else {
        result.reservation_ = reservationBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof grpc.generate.AddRequest) {
        return mergeFrom((grpc.generate.AddRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.generate.AddRequest other) {
      if (other == grpc.generate.AddRequest.getDefaultInstance()) return this;
      if (other.hasReservation()) {
        mergeReservation(other.getReservation());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      grpc.generate.AddRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.generate.AddRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private grpc.generate.Reservation reservation_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        grpc.generate.Reservation, grpc.generate.Reservation.Builder, grpc.generate.ReservationOrBuilder> reservationBuilder_;
    /**
     * <code>.grpc.generate.Reservation reservation = 1;</code>
     */
    public boolean hasReservation() {
      return reservationBuilder_ != null || reservation_ != null;
    }
    /**
     * <code>.grpc.generate.Reservation reservation = 1;</code>
     */
    public grpc.generate.Reservation getReservation() {
      if (reservationBuilder_ == null) {
        return reservation_ == null ? grpc.generate.Reservation.getDefaultInstance() : reservation_;
      } else {
        return reservationBuilder_.getMessage();
      }
    }
    /**
     * <code>.grpc.generate.Reservation reservation = 1;</code>
     */
    public Builder setReservation(grpc.generate.Reservation value) {
      if (reservationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        reservation_ = value;
        onChanged();
      } else {
        reservationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.grpc.generate.Reservation reservation = 1;</code>
     */
    public Builder setReservation(
        grpc.generate.Reservation.Builder builderForValue) {
      if (reservationBuilder_ == null) {
        reservation_ = builderForValue.build();
        onChanged();
      } else {
        reservationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.grpc.generate.Reservation reservation = 1;</code>
     */
    public Builder mergeReservation(grpc.generate.Reservation value) {
      if (reservationBuilder_ == null) {
        if (reservation_ != null) {
          reservation_ =
            grpc.generate.Reservation.newBuilder(reservation_).mergeFrom(value).buildPartial();
        } else {
          reservation_ = value;
        }
        onChanged();
      } else {
        reservationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.grpc.generate.Reservation reservation = 1;</code>
     */
    public Builder clearReservation() {
      if (reservationBuilder_ == null) {
        reservation_ = null;
        onChanged();
      } else {
        reservation_ = null;
        reservationBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.grpc.generate.Reservation reservation = 1;</code>
     */
    public grpc.generate.Reservation.Builder getReservationBuilder() {
      
      onChanged();
      return getReservationFieldBuilder().getBuilder();
    }
    /**
     * <code>.grpc.generate.Reservation reservation = 1;</code>
     */
    public grpc.generate.ReservationOrBuilder getReservationOrBuilder() {
      if (reservationBuilder_ != null) {
        return reservationBuilder_.getMessageOrBuilder();
      } else {
        return reservation_ == null ?
            grpc.generate.Reservation.getDefaultInstance() : reservation_;
      }
    }
    /**
     * <code>.grpc.generate.Reservation reservation = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        grpc.generate.Reservation, grpc.generate.Reservation.Builder, grpc.generate.ReservationOrBuilder> 
        getReservationFieldBuilder() {
      if (reservationBuilder_ == null) {
        reservationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            grpc.generate.Reservation, grpc.generate.Reservation.Builder, grpc.generate.ReservationOrBuilder>(
                getReservation(),
                getParentForChildren(),
                isClean());
        reservation_ = null;
      }
      return reservationBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:grpc.generate.AddRequest)
  }

  // @@protoc_insertion_point(class_scope:grpc.generate.AddRequest)
  private static final grpc.generate.AddRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.generate.AddRequest();
  }

  public static grpc.generate.AddRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddRequest>
      PARSER = new com.google.protobuf.AbstractParser<AddRequest>() {
    public AddRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AddRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddRequest> getParserForType() {
    return PARSER;
  }

  public grpc.generate.AddRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
