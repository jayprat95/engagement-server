/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.engagement.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)", date = "2013-12-2")
public class EventInfo implements org.apache.thrift.TBase<EventInfo, EventInfo._Fields>, java.io.Serializable, Cloneable, Comparable<EventInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("EventInfo");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField HEART_RATE_STANDARD_DEVIATION_FIELD_DESC = new org.apache.thrift.protocol.TField("heartRateStandardDeviation", org.apache.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.thrift.protocol.TField AVERAGE_ENGAGEMENT_FIELD_DESC = new org.apache.thrift.protocol.TField("averageEngagement", org.apache.thrift.protocol.TType.DOUBLE, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new EventInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new EventInfoTupleSchemeFactory());
  }

  public String name; // optional
  public double heartRateStandardDeviation; // optional
  public double averageEngagement; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    HEART_RATE_STANDARD_DEVIATION((short)2, "heartRateStandardDeviation"),
    AVERAGE_ENGAGEMENT((short)3, "averageEngagement");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NAME
          return NAME;
        case 2: // HEART_RATE_STANDARD_DEVIATION
          return HEART_RATE_STANDARD_DEVIATION;
        case 3: // AVERAGE_ENGAGEMENT
          return AVERAGE_ENGAGEMENT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __HEARTRATESTANDARDDEVIATION_ISSET_ID = 0;
  private static final int __AVERAGEENGAGEMENT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.NAME,_Fields.HEART_RATE_STANDARD_DEVIATION,_Fields.AVERAGE_ENGAGEMENT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HEART_RATE_STANDARD_DEVIATION, new org.apache.thrift.meta_data.FieldMetaData("heartRateStandardDeviation", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.AVERAGE_ENGAGEMENT, new org.apache.thrift.meta_data.FieldMetaData("averageEngagement", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(EventInfo.class, metaDataMap);
  }

  public EventInfo() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EventInfo(EventInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetName()) {
      this.name = other.name;
    }
    this.heartRateStandardDeviation = other.heartRateStandardDeviation;
    this.averageEngagement = other.averageEngagement;
  }

  public EventInfo deepCopy() {
    return new EventInfo(this);
  }

  @Override
  public void clear() {
    this.name = null;
    setHeartRateStandardDeviationIsSet(false);
    this.heartRateStandardDeviation = 0.0;
    setAverageEngagementIsSet(false);
    this.averageEngagement = 0.0;
  }

  public String getName() {
    return this.name;
  }

  public EventInfo setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public double getHeartRateStandardDeviation() {
    return this.heartRateStandardDeviation;
  }

  public EventInfo setHeartRateStandardDeviation(double heartRateStandardDeviation) {
    this.heartRateStandardDeviation = heartRateStandardDeviation;
    setHeartRateStandardDeviationIsSet(true);
    return this;
  }

  public void unsetHeartRateStandardDeviation() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __HEARTRATESTANDARDDEVIATION_ISSET_ID);
  }

  /** Returns true if field heartRateStandardDeviation is set (has been assigned a value) and false otherwise */
  public boolean isSetHeartRateStandardDeviation() {
    return EncodingUtils.testBit(__isset_bitfield, __HEARTRATESTANDARDDEVIATION_ISSET_ID);
  }

  public void setHeartRateStandardDeviationIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __HEARTRATESTANDARDDEVIATION_ISSET_ID, value);
  }

  public double getAverageEngagement() {
    return this.averageEngagement;
  }

  public EventInfo setAverageEngagement(double averageEngagement) {
    this.averageEngagement = averageEngagement;
    setAverageEngagementIsSet(true);
    return this;
  }

  public void unsetAverageEngagement() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __AVERAGEENGAGEMENT_ISSET_ID);
  }

  /** Returns true if field averageEngagement is set (has been assigned a value) and false otherwise */
  public boolean isSetAverageEngagement() {
    return EncodingUtils.testBit(__isset_bitfield, __AVERAGEENGAGEMENT_ISSET_ID);
  }

  public void setAverageEngagementIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __AVERAGEENGAGEMENT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case HEART_RATE_STANDARD_DEVIATION:
      if (value == null) {
        unsetHeartRateStandardDeviation();
      } else {
        setHeartRateStandardDeviation((Double)value);
      }
      break;

    case AVERAGE_ENGAGEMENT:
      if (value == null) {
        unsetAverageEngagement();
      } else {
        setAverageEngagement((Double)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case HEART_RATE_STANDARD_DEVIATION:
      return Double.valueOf(getHeartRateStandardDeviation());

    case AVERAGE_ENGAGEMENT:
      return Double.valueOf(getAverageEngagement());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case HEART_RATE_STANDARD_DEVIATION:
      return isSetHeartRateStandardDeviation();
    case AVERAGE_ENGAGEMENT:
      return isSetAverageEngagement();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof EventInfo)
      return this.equals((EventInfo)that);
    return false;
  }

  public boolean equals(EventInfo that) {
    if (that == null)
      return false;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_heartRateStandardDeviation = true && this.isSetHeartRateStandardDeviation();
    boolean that_present_heartRateStandardDeviation = true && that.isSetHeartRateStandardDeviation();
    if (this_present_heartRateStandardDeviation || that_present_heartRateStandardDeviation) {
      if (!(this_present_heartRateStandardDeviation && that_present_heartRateStandardDeviation))
        return false;
      if (this.heartRateStandardDeviation != that.heartRateStandardDeviation)
        return false;
    }

    boolean this_present_averageEngagement = true && this.isSetAverageEngagement();
    boolean that_present_averageEngagement = true && that.isSetAverageEngagement();
    if (this_present_averageEngagement || that_present_averageEngagement) {
      if (!(this_present_averageEngagement && that_present_averageEngagement))
        return false;
      if (this.averageEngagement != that.averageEngagement)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(EventInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHeartRateStandardDeviation()).compareTo(other.isSetHeartRateStandardDeviation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHeartRateStandardDeviation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.heartRateStandardDeviation, other.heartRateStandardDeviation);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAverageEngagement()).compareTo(other.isSetAverageEngagement());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAverageEngagement()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.averageEngagement, other.averageEngagement);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("EventInfo(");
    boolean first = true;

    if (isSetName()) {
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetHeartRateStandardDeviation()) {
      if (!first) sb.append(", ");
      sb.append("heartRateStandardDeviation:");
      sb.append(this.heartRateStandardDeviation);
      first = false;
    }
    if (isSetAverageEngagement()) {
      if (!first) sb.append(", ");
      sb.append("averageEngagement:");
      sb.append(this.averageEngagement);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class EventInfoStandardSchemeFactory implements SchemeFactory {
    public EventInfoStandardScheme getScheme() {
      return new EventInfoStandardScheme();
    }
  }

  private static class EventInfoStandardScheme extends StandardScheme<EventInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, EventInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HEART_RATE_STANDARD_DEVIATION
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.heartRateStandardDeviation = iprot.readDouble();
              struct.setHeartRateStandardDeviationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // AVERAGE_ENGAGEMENT
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.averageEngagement = iprot.readDouble();
              struct.setAverageEngagementIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, EventInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetHeartRateStandardDeviation()) {
        oprot.writeFieldBegin(HEART_RATE_STANDARD_DEVIATION_FIELD_DESC);
        oprot.writeDouble(struct.heartRateStandardDeviation);
        oprot.writeFieldEnd();
      }
      if (struct.isSetAverageEngagement()) {
        oprot.writeFieldBegin(AVERAGE_ENGAGEMENT_FIELD_DESC);
        oprot.writeDouble(struct.averageEngagement);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EventInfoTupleSchemeFactory implements SchemeFactory {
    public EventInfoTupleScheme getScheme() {
      return new EventInfoTupleScheme();
    }
  }

  private static class EventInfoTupleScheme extends TupleScheme<EventInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, EventInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetName()) {
        optionals.set(0);
      }
      if (struct.isSetHeartRateStandardDeviation()) {
        optionals.set(1);
      }
      if (struct.isSetAverageEngagement()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetHeartRateStandardDeviation()) {
        oprot.writeDouble(struct.heartRateStandardDeviation);
      }
      if (struct.isSetAverageEngagement()) {
        oprot.writeDouble(struct.averageEngagement);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, EventInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.heartRateStandardDeviation = iprot.readDouble();
        struct.setHeartRateStandardDeviationIsSet(true);
      }
      if (incoming.get(2)) {
        struct.averageEngagement = iprot.readDouble();
        struct.setAverageEngagementIsSet(true);
      }
    }
  }

}

