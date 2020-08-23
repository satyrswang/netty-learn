package com.wyq.protobuf;

public final class AddressBookProtos {
  private AddressBookProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PersonOrBuilder extends
      // @@protoc_insertion_point(interface_extends:tutorial.Person)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string name = 1;</code>
     * @return Whether the name field is set.
     */
    boolean hasName();
    /**
     * <code>required string name = 1;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>required string name = 1;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>required int32 id = 2;</code>
     * @return Whether the id field is set.
     */
    boolean hasId();
    /**
     * <code>required int32 id = 2;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>optional string email = 3;</code>
     * @return Whether the email field is set.
     */
    boolean hasEmail();
    /**
     * <code>optional string email = 3;</code>
     * @return The email.
     */
    java.lang.String getEmail();
    /**
     * <code>optional string email = 3;</code>
     * @return The bytes for email.
     */
    com.google.protobuf.ByteString
        getEmailBytes();

    /**
     * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
     */
    java.util.List<AddressBookProtos.Person.PhoneNumber> 
        getPhonesList();
    /**
     * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
     */
    AddressBookProtos.Person.PhoneNumber getPhones(int index);
    /**
     * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
     */
    int getPhonesCount();
    /**
     * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
     */
    java.util.List<? extends AddressBookProtos.Person.PhoneNumberOrBuilder> 
        getPhonesOrBuilderList();
    /**
     * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
     */
    AddressBookProtos.Person.PhoneNumberOrBuilder getPhonesOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code tutorial.Person}
   */
  public static final class Person extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:tutorial.Person)
      PersonOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Person.newBuilder() to construct.
    private Person(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Person() {
      name_ = "";
      email_ = "";
      phones_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Person();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Person(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              name_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              id_ = input.readInt32();
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              email_ = bs;
              break;
            }
            case 34: {
              if (!((mutable_bitField0_ & 0x00000008) != 0)) {
                phones_ = new java.util.ArrayList<AddressBookProtos.Person.PhoneNumber>();
                mutable_bitField0_ |= 0x00000008;
              }
              phones_.add(
                  input.readMessage(AddressBookProtos.Person.PhoneNumber.PARSER, extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
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
        if (((mutable_bitField0_ & 0x00000008) != 0)) {
          phones_ = java.util.Collections.unmodifiableList(phones_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return AddressBookProtos.internal_static_tutorial_Person_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return AddressBookProtos.internal_static_tutorial_Person_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AddressBookProtos.Person.class, AddressBookProtos.Person.Builder.class);
    }

    /**
     * Protobuf enum {@code tutorial.Person.PhoneType}
     */
    public enum PhoneType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>MOBILE = 0;</code>
       */
      MOBILE(0),
      /**
       * <code>HOME = 1;</code>
       */
      HOME(1),
      /**
       * <code>WORK = 2;</code>
       */
      WORK(2),
      ;

      /**
       * <code>MOBILE = 0;</code>
       */
      public static final int MOBILE_VALUE = 0;
      /**
       * <code>HOME = 1;</code>
       */
      public static final int HOME_VALUE = 1;
      /**
       * <code>WORK = 2;</code>
       */
      public static final int WORK_VALUE = 2;


      public final int getNumber() {
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static PhoneType valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static PhoneType forNumber(int value) {
        switch (value) {
          case 0: return MOBILE;
          case 1: return HOME;
          case 2: return WORK;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<PhoneType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          PhoneType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<PhoneType>() {
              public PhoneType findValueByNumber(int number) {
                return PhoneType.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return AddressBookProtos.Person.getDescriptor().getEnumTypes().get(0);
      }

      private static final PhoneType[] VALUES = values();

      public static PhoneType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private PhoneType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:tutorial.Person.PhoneType)
    }

    public interface PhoneNumberOrBuilder extends
        // @@protoc_insertion_point(interface_extends:tutorial.Person.PhoneNumber)
        com.google.protobuf.MessageOrBuilder {

      /**
       * <code>required string number = 1;</code>
       * @return Whether the number field is set.
       */
      boolean hasNumber();
      /**
       * <code>required string number = 1;</code>
       * @return The number.
       */
      java.lang.String getNumber();
      /**
       * <code>required string number = 1;</code>
       * @return The bytes for number.
       */
      com.google.protobuf.ByteString
          getNumberBytes();

      /**
       * <code>optional .tutorial.Person.PhoneType type = 2 [default = HOME];</code>
       * @return Whether the type field is set.
       */
      boolean hasType();
      /**
       * <code>optional .tutorial.Person.PhoneType type = 2 [default = HOME];</code>
       * @return The type.
       */
      AddressBookProtos.Person.PhoneType getType();
    }
    /**
     * Protobuf type {@code tutorial.Person.PhoneNumber}
     */
    public static final class PhoneNumber extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:tutorial.Person.PhoneNumber)
        PhoneNumberOrBuilder {
    private static final long serialVersionUID = 0L;
      // Use PhoneNumber.newBuilder() to construct.
      private PhoneNumber(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
      }
      private PhoneNumber() {
        number_ = "";
        type_ = 1;
      }

      @java.lang.Override
      @SuppressWarnings({"unused"})
      protected java.lang.Object newInstance(
          UnusedPrivateParameter unused) {
        return new PhoneNumber();
      }

      @java.lang.Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }
      private PhoneNumber(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        int mutable_bitField0_ = 0;
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
            com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                number_ = bs;
                break;
              }
              case 16: {
                int rawValue = input.readEnum();
                  @SuppressWarnings("deprecation")
                AddressBookProtos.Person.PhoneType value = AddressBookProtos.Person.PhoneType.valueOf(rawValue);
                if (value == null) {
                  unknownFields.mergeVarintField(2, rawValue);
                } else {
                  bitField0_ |= 0x00000002;
                  type_ = rawValue;
                }
                break;
              }
              default: {
                if (!parseUnknownField(
                    input, unknownFields, extensionRegistry, tag)) {
                  done = true;
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
          this.unknownFields = unknownFields.build();
          makeExtensionsImmutable();
        }
      }
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return AddressBookProtos.internal_static_tutorial_Person_PhoneNumber_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return AddressBookProtos.internal_static_tutorial_Person_PhoneNumber_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                AddressBookProtos.Person.PhoneNumber.class, AddressBookProtos.Person.PhoneNumber.Builder.class);
      }

      private int bitField0_;
      public static final int NUMBER_FIELD_NUMBER = 1;
      private volatile java.lang.Object number_;
      /**
       * <code>required string number = 1;</code>
       * @return Whether the number field is set.
       */
      @java.lang.Override
      public boolean hasNumber() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string number = 1;</code>
       * @return The number.
       */
      @java.lang.Override
      public java.lang.String getNumber() {
        java.lang.Object ref = number_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          com.google.protobuf.ByteString bs = 
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            number_ = s;
          }
          return s;
        }
      }
      /**
       * <code>required string number = 1;</code>
       * @return The bytes for number.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getNumberBytes() {
        java.lang.Object ref = number_;
        if (ref instanceof java.lang.String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          number_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      public static final int TYPE_FIELD_NUMBER = 2;
      private int type_;
      /**
       * <code>optional .tutorial.Person.PhoneType type = 2 [default = HOME];</code>
       * @return Whether the type field is set.
       */
      @java.lang.Override public boolean hasType() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional .tutorial.Person.PhoneType type = 2 [default = HOME];</code>
       * @return The type.
       */
      @java.lang.Override public AddressBookProtos.Person.PhoneType getType() {
        @SuppressWarnings("deprecation")
        AddressBookProtos.Person.PhoneType result = AddressBookProtos.Person.PhoneType.valueOf(type_);
        return result == null ? AddressBookProtos.Person.PhoneType.HOME : result;
      }

      private byte memoizedIsInitialized = -1;
      @java.lang.Override
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        if (!hasNumber()) {
          memoizedIsInitialized = 0;
          return false;
        }
        memoizedIsInitialized = 1;
        return true;
      }

      @java.lang.Override
      public void writeTo(com.google.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        if (((bitField0_ & 0x00000001) != 0)) {
          com.google.protobuf.GeneratedMessageV3.writeString(output, 1, number_);
        }
        if (((bitField0_ & 0x00000002) != 0)) {
          output.writeEnum(2, type_);
        }
        unknownFields.writeTo(output);
      }

      @java.lang.Override
      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) != 0)) {
          size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, number_);
        }
        if (((bitField0_ & 0x00000002) != 0)) {
          size += com.google.protobuf.CodedOutputStream
            .computeEnumSize(2, type_);
        }
        size += unknownFields.getSerializedSize();
        memoizedSize = size;
        return size;
      }

      @java.lang.Override
      public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
         return true;
        }
        if (!(obj instanceof AddressBookProtos.Person.PhoneNumber)) {
          return super.equals(obj);
        }
        AddressBookProtos.Person.PhoneNumber other = (AddressBookProtos.Person.PhoneNumber) obj;

        if (hasNumber() != other.hasNumber()) return false;
        if (hasNumber()) {
          if (!getNumber()
              .equals(other.getNumber())) return false;
        }
        if (hasType() != other.hasType()) return false;
        if (hasType()) {
          if (type_ != other.type_) return false;
        }
        if (!unknownFields.equals(other.unknownFields)) return false;
        return true;
      }

      @java.lang.Override
      public int hashCode() {
        if (memoizedHashCode != 0) {
          return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        if (hasNumber()) {
          hash = (37 * hash) + NUMBER_FIELD_NUMBER;
          hash = (53 * hash) + getNumber().hashCode();
        }
        if (hasType()) {
          hash = (37 * hash) + TYPE_FIELD_NUMBER;
          hash = (53 * hash) + type_;
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static AddressBookProtos.Person.PhoneNumber parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static AddressBookProtos.Person.PhoneNumber parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static AddressBookProtos.Person.PhoneNumber parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static AddressBookProtos.Person.PhoneNumber parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static AddressBookProtos.Person.PhoneNumber parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static AddressBookProtos.Person.PhoneNumber parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static AddressBookProtos.Person.PhoneNumber parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static AddressBookProtos.Person.PhoneNumber parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }
      public static AddressBookProtos.Person.PhoneNumber parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
      }
      public static AddressBookProtos.Person.PhoneNumber parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static AddressBookProtos.Person.PhoneNumber parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static AddressBookProtos.Person.PhoneNumber parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }

      @java.lang.Override
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
      }
      public static Builder newBuilder(AddressBookProtos.Person.PhoneNumber prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }
      @java.lang.Override
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
       * Protobuf type {@code tutorial.Person.PhoneNumber}
       */
      public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:tutorial.Person.PhoneNumber)
          AddressBookProtos.Person.PhoneNumberOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return AddressBookProtos.internal_static_tutorial_Person_PhoneNumber_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return AddressBookProtos.internal_static_tutorial_Person_PhoneNumber_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  AddressBookProtos.Person.PhoneNumber.class, AddressBookProtos.Person.PhoneNumber.Builder.class);
        }

        // Construct using AddressBookProtos.Person.PhoneNumber.newBuilder()
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
        @java.lang.Override
        public Builder clear() {
          super.clear();
          number_ = "";
          bitField0_ = (bitField0_ & ~0x00000001);
          type_ = 1;
          bitField0_ = (bitField0_ & ~0x00000002);
          return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return AddressBookProtos.internal_static_tutorial_Person_PhoneNumber_descriptor;
        }

        @java.lang.Override
        public AddressBookProtos.Person.PhoneNumber getDefaultInstanceForType() {
          return AddressBookProtos.Person.PhoneNumber.getDefaultInstance();
        }

        @java.lang.Override
        public AddressBookProtos.Person.PhoneNumber build() {
          AddressBookProtos.Person.PhoneNumber result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        @java.lang.Override
        public AddressBookProtos.Person.PhoneNumber buildPartial() {
          AddressBookProtos.Person.PhoneNumber result = new AddressBookProtos.Person.PhoneNumber(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) != 0)) {
            to_bitField0_ |= 0x00000001;
          }
          result.number_ = number_;
          if (((from_bitField0_ & 0x00000002) != 0)) {
            to_bitField0_ |= 0x00000002;
          }
          result.type_ = type_;
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }

        @java.lang.Override
        public Builder clone() {
          return super.clone();
        }
        @java.lang.Override
        public Builder setField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return super.setField(field, value);
        }
        @java.lang.Override
        public Builder clearField(
            com.google.protobuf.Descriptors.FieldDescriptor field) {
          return super.clearField(field);
        }
        @java.lang.Override
        public Builder clearOneof(
            com.google.protobuf.Descriptors.OneofDescriptor oneof) {
          return super.clearOneof(oneof);
        }
        @java.lang.Override
        public Builder setRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            int index, java.lang.Object value) {
          return super.setRepeatedField(field, index, value);
        }
        @java.lang.Override
        public Builder addRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return super.addRepeatedField(field, value);
        }
        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof AddressBookProtos.Person.PhoneNumber) {
            return mergeFrom((AddressBookProtos.Person.PhoneNumber)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(AddressBookProtos.Person.PhoneNumber other) {
          if (other == AddressBookProtos.Person.PhoneNumber.getDefaultInstance()) return this;
          if (other.hasNumber()) {
            bitField0_ |= 0x00000001;
            number_ = other.number_;
            onChanged();
          }
          if (other.hasType()) {
            setType(other.getType());
          }
          this.mergeUnknownFields(other.unknownFields);
          onChanged();
          return this;
        }

        @java.lang.Override
        public final boolean isInitialized() {
          if (!hasNumber()) {
            return false;
          }
          return true;
        }

        @java.lang.Override
        public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          AddressBookProtos.Person.PhoneNumber parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (AddressBookProtos.Person.PhoneNumber) e.getUnfinishedMessage();
            throw e.unwrapIOException();
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }
        private int bitField0_;

        private java.lang.Object number_ = "";
        /**
         * <code>required string number = 1;</code>
         * @return Whether the number field is set.
         */
        public boolean hasNumber() {
          return ((bitField0_ & 0x00000001) != 0);
        }
        /**
         * <code>required string number = 1;</code>
         * @return The number.
         */
        public java.lang.String getNumber() {
          java.lang.Object ref = number_;
          if (!(ref instanceof java.lang.String)) {
            com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              number_ = s;
            }
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }
        /**
         * <code>required string number = 1;</code>
         * @return The bytes for number.
         */
        public com.google.protobuf.ByteString
            getNumberBytes() {
          java.lang.Object ref = number_;
          if (ref instanceof String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            number_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }
        /**
         * <code>required string number = 1;</code>
         * @param value The number to set.
         * @return This builder for chaining.
         */
        public Builder setNumber(
            java.lang.String value) {
          if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
          number_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>required string number = 1;</code>
         * @return This builder for chaining.
         */
        public Builder clearNumber() {
          bitField0_ = (bitField0_ & ~0x00000001);
          number_ = getDefaultInstance().getNumber();
          onChanged();
          return this;
        }
        /**
         * <code>required string number = 1;</code>
         * @param value The bytes for number to set.
         * @return This builder for chaining.
         */
        public Builder setNumberBytes(
            com.google.protobuf.ByteString value) {
          if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
          number_ = value;
          onChanged();
          return this;
        }

        private int type_ = 1;
        /**
         * <code>optional .tutorial.Person.PhoneType type = 2 [default = HOME];</code>
         * @return Whether the type field is set.
         */
        @java.lang.Override public boolean hasType() {
          return ((bitField0_ & 0x00000002) != 0);
        }
        /**
         * <code>optional .tutorial.Person.PhoneType type = 2 [default = HOME];</code>
         * @return The type.
         */
        @java.lang.Override
        public AddressBookProtos.Person.PhoneType getType() {
          @SuppressWarnings("deprecation")
          AddressBookProtos.Person.PhoneType result = AddressBookProtos.Person.PhoneType.valueOf(type_);
          return result == null ? AddressBookProtos.Person.PhoneType.HOME : result;
        }
        /**
         * <code>optional .tutorial.Person.PhoneType type = 2 [default = HOME];</code>
         * @param value The type to set.
         * @return This builder for chaining.
         */
        public Builder setType(AddressBookProtos.Person.PhoneType value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000002;
          type_ = value.getNumber();
          onChanged();
          return this;
        }
        /**
         * <code>optional .tutorial.Person.PhoneType type = 2 [default = HOME];</code>
         * @return This builder for chaining.
         */
        public Builder clearType() {
          bitField0_ = (bitField0_ & ~0x00000002);
          type_ = 1;
          onChanged();
          return this;
        }
        @java.lang.Override
        public final Builder setUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.setUnknownFields(unknownFields);
        }

        @java.lang.Override
        public final Builder mergeUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:tutorial.Person.PhoneNumber)
      }

      // @@protoc_insertion_point(class_scope:tutorial.Person.PhoneNumber)
      private static final AddressBookProtos.Person.PhoneNumber DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new AddressBookProtos.Person.PhoneNumber();
      }

      public static AddressBookProtos.Person.PhoneNumber getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      @java.lang.Deprecated public static final com.google.protobuf.Parser<PhoneNumber>
          PARSER = new com.google.protobuf.AbstractParser<PhoneNumber>() {
        @java.lang.Override
        public PhoneNumber parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new PhoneNumber(input, extensionRegistry);
        }
      };

      public static com.google.protobuf.Parser<PhoneNumber> parser() {
        return PARSER;
      }

      @java.lang.Override
      public com.google.protobuf.Parser<PhoneNumber> getParserForType() {
        return PARSER;
      }

      @java.lang.Override
      public AddressBookProtos.Person.PhoneNumber getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <code>required string name = 1;</code>
     * @return Whether the name field is set.
     */
    @java.lang.Override
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string name = 1;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string name = 1;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ID_FIELD_NUMBER = 2;
    private int id_;
    /**
     * <code>required int32 id = 2;</code>
     * @return Whether the id field is set.
     */
    @java.lang.Override
    public boolean hasId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required int32 id = 2;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int EMAIL_FIELD_NUMBER = 3;
    private volatile java.lang.Object email_;
    /**
     * <code>optional string email = 3;</code>
     * @return Whether the email field is set.
     */
    @java.lang.Override
    public boolean hasEmail() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional string email = 3;</code>
     * @return The email.
     */
    @java.lang.Override
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          email_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string email = 3;</code>
     * @return The bytes for email.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PHONES_FIELD_NUMBER = 4;
    private java.util.List<AddressBookProtos.Person.PhoneNumber> phones_;
    /**
     * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
     */
    @java.lang.Override
    public java.util.List<AddressBookProtos.Person.PhoneNumber> getPhonesList() {
      return phones_;
    }
    /**
     * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
     */
    @java.lang.Override
    public java.util.List<? extends AddressBookProtos.Person.PhoneNumberOrBuilder> 
        getPhonesOrBuilderList() {
      return phones_;
    }
    /**
     * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
     */
    @java.lang.Override
    public int getPhonesCount() {
      return phones_.size();
    }
    /**
     * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
     */
    @java.lang.Override
    public AddressBookProtos.Person.PhoneNumber getPhones(int index) {
      return phones_.get(index);
    }
    /**
     * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
     */
    @java.lang.Override
    public AddressBookProtos.Person.PhoneNumberOrBuilder getPhonesOrBuilder(
        int index) {
      return phones_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getPhonesCount(); i++) {
        if (!getPhones(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeInt32(2, id_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, email_);
      }
      for (int i = 0; i < phones_.size(); i++) {
        output.writeMessage(4, phones_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, id_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, email_);
      }
      for (int i = 0; i < phones_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, phones_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof AddressBookProtos.Person)) {
        return super.equals(obj);
      }
      AddressBookProtos.Person other = (AddressBookProtos.Person) obj;

      if (hasName() != other.hasName()) return false;
      if (hasName()) {
        if (!getName()
            .equals(other.getName())) return false;
      }
      if (hasId() != other.hasId()) return false;
      if (hasId()) {
        if (getId()
            != other.getId()) return false;
      }
      if (hasEmail() != other.hasEmail()) return false;
      if (hasEmail()) {
        if (!getEmail()
            .equals(other.getEmail())) return false;
      }
      if (!getPhonesList()
          .equals(other.getPhonesList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasId()) {
        hash = (37 * hash) + ID_FIELD_NUMBER;
        hash = (53 * hash) + getId();
      }
      if (hasEmail()) {
        hash = (37 * hash) + EMAIL_FIELD_NUMBER;
        hash = (53 * hash) + getEmail().hashCode();
      }
      if (getPhonesCount() > 0) {
        hash = (37 * hash) + PHONES_FIELD_NUMBER;
        hash = (53 * hash) + getPhonesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static AddressBookProtos.Person parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AddressBookProtos.Person parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AddressBookProtos.Person parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AddressBookProtos.Person parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AddressBookProtos.Person parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AddressBookProtos.Person parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AddressBookProtos.Person parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static AddressBookProtos.Person parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static AddressBookProtos.Person parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static AddressBookProtos.Person parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static AddressBookProtos.Person parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static AddressBookProtos.Person parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(AddressBookProtos.Person prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * Protobuf type {@code tutorial.Person}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:tutorial.Person)
        AddressBookProtos.PersonOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return AddressBookProtos.internal_static_tutorial_Person_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return AddressBookProtos.internal_static_tutorial_Person_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                AddressBookProtos.Person.class, AddressBookProtos.Person.Builder.class);
      }

      // Construct using AddressBookProtos.Person.newBuilder()
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
          getPhonesFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        email_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        if (phonesBuilder_ == null) {
          phones_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          phonesBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return AddressBookProtos.internal_static_tutorial_Person_descriptor;
      }

      @java.lang.Override
      public AddressBookProtos.Person getDefaultInstanceForType() {
        return AddressBookProtos.Person.getDefaultInstance();
      }

      @java.lang.Override
      public AddressBookProtos.Person build() {
        AddressBookProtos.Person result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public AddressBookProtos.Person buildPartial() {
        AddressBookProtos.Person result = new AddressBookProtos.Person(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.id_ = id_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.email_ = email_;
        if (phonesBuilder_ == null) {
          if (((bitField0_ & 0x00000008) != 0)) {
            phones_ = java.util.Collections.unmodifiableList(phones_);
            bitField0_ = (bitField0_ & ~0x00000008);
          }
          result.phones_ = phones_;
        } else {
          result.phones_ = phonesBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof AddressBookProtos.Person) {
          return mergeFrom((AddressBookProtos.Person)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(AddressBookProtos.Person other) {
        if (other == AddressBookProtos.Person.getDefaultInstance()) return this;
        if (other.hasName()) {
          bitField0_ |= 0x00000001;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasEmail()) {
          bitField0_ |= 0x00000004;
          email_ = other.email_;
          onChanged();
        }
        if (phonesBuilder_ == null) {
          if (!other.phones_.isEmpty()) {
            if (phones_.isEmpty()) {
              phones_ = other.phones_;
              bitField0_ = (bitField0_ & ~0x00000008);
            } else {
              ensurePhonesIsMutable();
              phones_.addAll(other.phones_);
            }
            onChanged();
          }
        } else {
          if (!other.phones_.isEmpty()) {
            if (phonesBuilder_.isEmpty()) {
              phonesBuilder_.dispose();
              phonesBuilder_ = null;
              phones_ = other.phones_;
              bitField0_ = (bitField0_ & ~0x00000008);
              phonesBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPhonesFieldBuilder() : null;
            } else {
              phonesBuilder_.addAllMessages(other.phones_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasName()) {
          return false;
        }
        if (!hasId()) {
          return false;
        }
        for (int i = 0; i < getPhonesCount(); i++) {
          if (!getPhones(i).isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        AddressBookProtos.Person parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (AddressBookProtos.Person) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       * <code>required string name = 1;</code>
       * @return Whether the name field is set.
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string name = 1;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string name = 1;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string name = 1;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 1;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <code>required int32 id = 2;</code>
       * @return Whether the id field is set.
       */
      @java.lang.Override
      public boolean hasId() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required int32 id = 2;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>required int32 id = 2;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        bitField0_ |= 0x00000002;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        id_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object email_ = "";
      /**
       * <code>optional string email = 3;</code>
       * @return Whether the email field is set.
       */
      public boolean hasEmail() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional string email = 3;</code>
       * @return The email.
       */
      public java.lang.String getEmail() {
        java.lang.Object ref = email_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            email_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string email = 3;</code>
       * @return The bytes for email.
       */
      public com.google.protobuf.ByteString
          getEmailBytes() {
        java.lang.Object ref = email_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          email_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string email = 3;</code>
       * @param value The email to set.
       * @return This builder for chaining.
       */
      public Builder setEmail(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        email_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string email = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearEmail() {
        bitField0_ = (bitField0_ & ~0x00000004);
        email_ = getDefaultInstance().getEmail();
        onChanged();
        return this;
      }
      /**
       * <code>optional string email = 3;</code>
       * @param value The bytes for email to set.
       * @return This builder for chaining.
       */
      public Builder setEmailBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        email_ = value;
        onChanged();
        return this;
      }

      private java.util.List<AddressBookProtos.Person.PhoneNumber> phones_ =
        java.util.Collections.emptyList();
      private void ensurePhonesIsMutable() {
        if (!((bitField0_ & 0x00000008) != 0)) {
          phones_ = new java.util.ArrayList<AddressBookProtos.Person.PhoneNumber>(phones_);
          bitField0_ |= 0x00000008;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          AddressBookProtos.Person.PhoneNumber, AddressBookProtos.Person.PhoneNumber.Builder, AddressBookProtos.Person.PhoneNumberOrBuilder> phonesBuilder_;

      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public java.util.List<AddressBookProtos.Person.PhoneNumber> getPhonesList() {
        if (phonesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(phones_);
        } else {
          return phonesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public int getPhonesCount() {
        if (phonesBuilder_ == null) {
          return phones_.size();
        } else {
          return phonesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public AddressBookProtos.Person.PhoneNumber getPhones(int index) {
        if (phonesBuilder_ == null) {
          return phones_.get(index);
        } else {
          return phonesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public Builder setPhones(
          int index, AddressBookProtos.Person.PhoneNumber value) {
        if (phonesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePhonesIsMutable();
          phones_.set(index, value);
          onChanged();
        } else {
          phonesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public Builder setPhones(
          int index, AddressBookProtos.Person.PhoneNumber.Builder builderForValue) {
        if (phonesBuilder_ == null) {
          ensurePhonesIsMutable();
          phones_.set(index, builderForValue.build());
          onChanged();
        } else {
          phonesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public Builder addPhones(AddressBookProtos.Person.PhoneNumber value) {
        if (phonesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePhonesIsMutable();
          phones_.add(value);
          onChanged();
        } else {
          phonesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public Builder addPhones(
          int index, AddressBookProtos.Person.PhoneNumber value) {
        if (phonesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePhonesIsMutable();
          phones_.add(index, value);
          onChanged();
        } else {
          phonesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public Builder addPhones(
          AddressBookProtos.Person.PhoneNumber.Builder builderForValue) {
        if (phonesBuilder_ == null) {
          ensurePhonesIsMutable();
          phones_.add(builderForValue.build());
          onChanged();
        } else {
          phonesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public Builder addPhones(
          int index, AddressBookProtos.Person.PhoneNumber.Builder builderForValue) {
        if (phonesBuilder_ == null) {
          ensurePhonesIsMutable();
          phones_.add(index, builderForValue.build());
          onChanged();
        } else {
          phonesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public Builder addAllPhones(
          java.lang.Iterable<? extends AddressBookProtos.Person.PhoneNumber> values) {
        if (phonesBuilder_ == null) {
          ensurePhonesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, phones_);
          onChanged();
        } else {
          phonesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public Builder clearPhones() {
        if (phonesBuilder_ == null) {
          phones_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
          onChanged();
        } else {
          phonesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public Builder removePhones(int index) {
        if (phonesBuilder_ == null) {
          ensurePhonesIsMutable();
          phones_.remove(index);
          onChanged();
        } else {
          phonesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public AddressBookProtos.Person.PhoneNumber.Builder getPhonesBuilder(
          int index) {
        return getPhonesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public AddressBookProtos.Person.PhoneNumberOrBuilder getPhonesOrBuilder(
          int index) {
        if (phonesBuilder_ == null) {
          return phones_.get(index);  } else {
          return phonesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public java.util.List<? extends AddressBookProtos.Person.PhoneNumberOrBuilder> 
           getPhonesOrBuilderList() {
        if (phonesBuilder_ != null) {
          return phonesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(phones_);
        }
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public AddressBookProtos.Person.PhoneNumber.Builder addPhonesBuilder() {
        return getPhonesFieldBuilder().addBuilder(
            AddressBookProtos.Person.PhoneNumber.getDefaultInstance());
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public AddressBookProtos.Person.PhoneNumber.Builder addPhonesBuilder(
          int index) {
        return getPhonesFieldBuilder().addBuilder(
            index, AddressBookProtos.Person.PhoneNumber.getDefaultInstance());
      }
      /**
       * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
       */
      public java.util.List<AddressBookProtos.Person.PhoneNumber.Builder> 
           getPhonesBuilderList() {
        return getPhonesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          AddressBookProtos.Person.PhoneNumber, AddressBookProtos.Person.PhoneNumber.Builder, AddressBookProtos.Person.PhoneNumberOrBuilder> 
          getPhonesFieldBuilder() {
        if (phonesBuilder_ == null) {
          phonesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              AddressBookProtos.Person.PhoneNumber, AddressBookProtos.Person.PhoneNumber.Builder, AddressBookProtos.Person.PhoneNumberOrBuilder>(
                  phones_,
                  ((bitField0_ & 0x00000008) != 0),
                  getParentForChildren(),
                  isClean());
          phones_ = null;
        }
        return phonesBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:tutorial.Person)
    }

    // @@protoc_insertion_point(class_scope:tutorial.Person)
    private static final AddressBookProtos.Person DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new AddressBookProtos.Person();
    }

    public static AddressBookProtos.Person getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Person>
        PARSER = new com.google.protobuf.AbstractParser<Person>() {
      @java.lang.Override
      public Person parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Person(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Person> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Person> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public AddressBookProtos.Person getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface AddressBookOrBuilder extends
      // @@protoc_insertion_point(interface_extends:tutorial.AddressBook)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .tutorial.Person people = 1;</code>
     */
    java.util.List<AddressBookProtos.Person> 
        getPeopleList();
    /**
     * <code>repeated .tutorial.Person people = 1;</code>
     */
    AddressBookProtos.Person getPeople(int index);
    /**
     * <code>repeated .tutorial.Person people = 1;</code>
     */
    int getPeopleCount();
    /**
     * <code>repeated .tutorial.Person people = 1;</code>
     */
    java.util.List<? extends AddressBookProtos.PersonOrBuilder> 
        getPeopleOrBuilderList();
    /**
     * <code>repeated .tutorial.Person people = 1;</code>
     */
    AddressBookProtos.PersonOrBuilder getPeopleOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code tutorial.AddressBook}
   */
  public static final class AddressBook extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:tutorial.AddressBook)
      AddressBookOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AddressBook.newBuilder() to construct.
    private AddressBook(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AddressBook() {
      people_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AddressBook();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AddressBook(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                people_ = new java.util.ArrayList<AddressBookProtos.Person>();
                mutable_bitField0_ |= 0x00000001;
              }
              people_.add(
                  input.readMessage(AddressBookProtos.Person.PARSER, extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          people_ = java.util.Collections.unmodifiableList(people_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return AddressBookProtos.internal_static_tutorial_AddressBook_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return AddressBookProtos.internal_static_tutorial_AddressBook_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AddressBookProtos.AddressBook.class, AddressBookProtos.AddressBook.Builder.class);
    }

    public static final int PEOPLE_FIELD_NUMBER = 1;
    private java.util.List<AddressBookProtos.Person> people_;
    /**
     * <code>repeated .tutorial.Person people = 1;</code>
     */
    @java.lang.Override
    public java.util.List<AddressBookProtos.Person> getPeopleList() {
      return people_;
    }
    /**
     * <code>repeated .tutorial.Person people = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends AddressBookProtos.PersonOrBuilder> 
        getPeopleOrBuilderList() {
      return people_;
    }
    /**
     * <code>repeated .tutorial.Person people = 1;</code>
     */
    @java.lang.Override
    public int getPeopleCount() {
      return people_.size();
    }
    /**
     * <code>repeated .tutorial.Person people = 1;</code>
     */
    @java.lang.Override
    public AddressBookProtos.Person getPeople(int index) {
      return people_.get(index);
    }
    /**
     * <code>repeated .tutorial.Person people = 1;</code>
     */
    @java.lang.Override
    public AddressBookProtos.PersonOrBuilder getPeopleOrBuilder(
        int index) {
      return people_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getPeopleCount(); i++) {
        if (!getPeople(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < people_.size(); i++) {
        output.writeMessage(1, people_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < people_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, people_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof AddressBookProtos.AddressBook)) {
        return super.equals(obj);
      }
      AddressBookProtos.AddressBook other = (AddressBookProtos.AddressBook) obj;

      if (!getPeopleList()
          .equals(other.getPeopleList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getPeopleCount() > 0) {
        hash = (37 * hash) + PEOPLE_FIELD_NUMBER;
        hash = (53 * hash) + getPeopleList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static AddressBookProtos.AddressBook parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AddressBookProtos.AddressBook parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AddressBookProtos.AddressBook parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AddressBookProtos.AddressBook parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AddressBookProtos.AddressBook parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AddressBookProtos.AddressBook parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AddressBookProtos.AddressBook parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static AddressBookProtos.AddressBook parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static AddressBookProtos.AddressBook parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static AddressBookProtos.AddressBook parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static AddressBookProtos.AddressBook parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static AddressBookProtos.AddressBook parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(AddressBookProtos.AddressBook prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * Protobuf type {@code tutorial.AddressBook}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:tutorial.AddressBook)
        AddressBookProtos.AddressBookOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return AddressBookProtos.internal_static_tutorial_AddressBook_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return AddressBookProtos.internal_static_tutorial_AddressBook_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                AddressBookProtos.AddressBook.class, AddressBookProtos.AddressBook.Builder.class);
      }

      // Construct using AddressBookProtos.AddressBook.newBuilder()
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
          getPeopleFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (peopleBuilder_ == null) {
          people_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          peopleBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return AddressBookProtos.internal_static_tutorial_AddressBook_descriptor;
      }

      @java.lang.Override
      public AddressBookProtos.AddressBook getDefaultInstanceForType() {
        return AddressBookProtos.AddressBook.getDefaultInstance();
      }

      @java.lang.Override
      public AddressBookProtos.AddressBook build() {
        AddressBookProtos.AddressBook result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public AddressBookProtos.AddressBook buildPartial() {
        AddressBookProtos.AddressBook result = new AddressBookProtos.AddressBook(this);
        int from_bitField0_ = bitField0_;
        if (peopleBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            people_ = java.util.Collections.unmodifiableList(people_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.people_ = people_;
        } else {
          result.people_ = peopleBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof AddressBookProtos.AddressBook) {
          return mergeFrom((AddressBookProtos.AddressBook)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(AddressBookProtos.AddressBook other) {
        if (other == AddressBookProtos.AddressBook.getDefaultInstance()) return this;
        if (peopleBuilder_ == null) {
          if (!other.people_.isEmpty()) {
            if (people_.isEmpty()) {
              people_ = other.people_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePeopleIsMutable();
              people_.addAll(other.people_);
            }
            onChanged();
          }
        } else {
          if (!other.people_.isEmpty()) {
            if (peopleBuilder_.isEmpty()) {
              peopleBuilder_.dispose();
              peopleBuilder_ = null;
              people_ = other.people_;
              bitField0_ = (bitField0_ & ~0x00000001);
              peopleBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPeopleFieldBuilder() : null;
            } else {
              peopleBuilder_.addAllMessages(other.people_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        for (int i = 0; i < getPeopleCount(); i++) {
          if (!getPeople(i).isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        AddressBookProtos.AddressBook parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (AddressBookProtos.AddressBook) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<AddressBookProtos.Person> people_ =
        java.util.Collections.emptyList();
      private void ensurePeopleIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          people_ = new java.util.ArrayList<AddressBookProtos.Person>(people_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          AddressBookProtos.Person, AddressBookProtos.Person.Builder, AddressBookProtos.PersonOrBuilder> peopleBuilder_;

      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public java.util.List<AddressBookProtos.Person> getPeopleList() {
        if (peopleBuilder_ == null) {
          return java.util.Collections.unmodifiableList(people_);
        } else {
          return peopleBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public int getPeopleCount() {
        if (peopleBuilder_ == null) {
          return people_.size();
        } else {
          return peopleBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public AddressBookProtos.Person getPeople(int index) {
        if (peopleBuilder_ == null) {
          return people_.get(index);
        } else {
          return peopleBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public Builder setPeople(
          int index, AddressBookProtos.Person value) {
        if (peopleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePeopleIsMutable();
          people_.set(index, value);
          onChanged();
        } else {
          peopleBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public Builder setPeople(
          int index, AddressBookProtos.Person.Builder builderForValue) {
        if (peopleBuilder_ == null) {
          ensurePeopleIsMutable();
          people_.set(index, builderForValue.build());
          onChanged();
        } else {
          peopleBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public Builder addPeople(AddressBookProtos.Person value) {
        if (peopleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePeopleIsMutable();
          people_.add(value);
          onChanged();
        } else {
          peopleBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public Builder addPeople(
          int index, AddressBookProtos.Person value) {
        if (peopleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePeopleIsMutable();
          people_.add(index, value);
          onChanged();
        } else {
          peopleBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public Builder addPeople(
          AddressBookProtos.Person.Builder builderForValue) {
        if (peopleBuilder_ == null) {
          ensurePeopleIsMutable();
          people_.add(builderForValue.build());
          onChanged();
        } else {
          peopleBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public Builder addPeople(
          int index, AddressBookProtos.Person.Builder builderForValue) {
        if (peopleBuilder_ == null) {
          ensurePeopleIsMutable();
          people_.add(index, builderForValue.build());
          onChanged();
        } else {
          peopleBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public Builder addAllPeople(
          java.lang.Iterable<? extends AddressBookProtos.Person> values) {
        if (peopleBuilder_ == null) {
          ensurePeopleIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, people_);
          onChanged();
        } else {
          peopleBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public Builder clearPeople() {
        if (peopleBuilder_ == null) {
          people_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          peopleBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public Builder removePeople(int index) {
        if (peopleBuilder_ == null) {
          ensurePeopleIsMutable();
          people_.remove(index);
          onChanged();
        } else {
          peopleBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public AddressBookProtos.Person.Builder getPeopleBuilder(
          int index) {
        return getPeopleFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public AddressBookProtos.PersonOrBuilder getPeopleOrBuilder(
          int index) {
        if (peopleBuilder_ == null) {
          return people_.get(index);  } else {
          return peopleBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public java.util.List<? extends AddressBookProtos.PersonOrBuilder> 
           getPeopleOrBuilderList() {
        if (peopleBuilder_ != null) {
          return peopleBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(people_);
        }
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public AddressBookProtos.Person.Builder addPeopleBuilder() {
        return getPeopleFieldBuilder().addBuilder(
            AddressBookProtos.Person.getDefaultInstance());
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public AddressBookProtos.Person.Builder addPeopleBuilder(
          int index) {
        return getPeopleFieldBuilder().addBuilder(
            index, AddressBookProtos.Person.getDefaultInstance());
      }
      /**
       * <code>repeated .tutorial.Person people = 1;</code>
       */
      public java.util.List<AddressBookProtos.Person.Builder> 
           getPeopleBuilderList() {
        return getPeopleFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          AddressBookProtos.Person, AddressBookProtos.Person.Builder, AddressBookProtos.PersonOrBuilder> 
          getPeopleFieldBuilder() {
        if (peopleBuilder_ == null) {
          peopleBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              AddressBookProtos.Person, AddressBookProtos.Person.Builder, AddressBookProtos.PersonOrBuilder>(
                  people_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          people_ = null;
        }
        return peopleBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:tutorial.AddressBook)
    }

    // @@protoc_insertion_point(class_scope:tutorial.AddressBook)
    private static final AddressBookProtos.AddressBook DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new AddressBookProtos.AddressBook();
    }

    public static AddressBookProtos.AddressBook getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<AddressBook>
        PARSER = new com.google.protobuf.AbstractParser<AddressBook>() {
      @java.lang.Override
      public AddressBook parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AddressBook(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AddressBook> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AddressBook> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public AddressBookProtos.AddressBook getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_Person_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_Person_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_Person_PhoneNumber_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_Person_PhoneNumber_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_AddressBook_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_AddressBook_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\ntest.proto\022\010tutorial\"\333\001\n\006Person\022\014\n\004nam" +
      "e\030\001 \002(\t\022\n\n\002id\030\002 \002(\005\022\r\n\005email\030\003 \001(\t\022,\n\006ph" +
      "ones\030\004 \003(\0132\034.tutorial.Person.PhoneNumber" +
      "\032M\n\013PhoneNumber\022\016\n\006number\030\001 \002(\t\022.\n\004type\030" +
      "\002 \001(\0162\032.tutorial.Person.PhoneType:\004HOME\"" +
      "+\n\tPhoneType\022\n\n\006MOBILE\020\000\022\010\n\004HOME\020\001\022\010\n\004WO" +
      "RK\020\002\"/\n\013AddressBook\022 \n\006people\030\001 \003(\0132\020.tu" +
      "torial.PersonB\025\n\000B\021AddressBookProtos"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_tutorial_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tutorial_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_Person_descriptor,
        new java.lang.String[] { "Name", "Id", "Email", "Phones", });
    internal_static_tutorial_Person_PhoneNumber_descriptor =
      internal_static_tutorial_Person_descriptor.getNestedTypes().get(0);
    internal_static_tutorial_Person_PhoneNumber_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_Person_PhoneNumber_descriptor,
        new java.lang.String[] { "Number", "Type", });
    internal_static_tutorial_AddressBook_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tutorial_AddressBook_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_AddressBook_descriptor,
        new java.lang.String[] { "People", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
