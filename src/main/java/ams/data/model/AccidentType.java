/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package ams.data.model;
@org.apache.avro.specific.AvroGenerated
public enum AccidentType implements org.apache.avro.generic.GenericEnumSymbol<AccidentType> {
  CRIMINAL, CAR_ACCIDENT, OTHER_ACCIDENT, FIRE_ACCIDENT  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"AccidentType\",\"namespace\":\"ams.data.model\",\"symbols\":[\"CRIMINAL\",\"CAR_ACCIDENT\",\"OTHER_ACCIDENT\",\"FIRE_ACCIDENT\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
}
