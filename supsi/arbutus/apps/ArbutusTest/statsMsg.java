/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'statsMsg'
 * message type.
 */

public class statsMsg extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 15;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 136;

    /** Create a new statsMsg of size 15. */
    public statsMsg() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new statsMsg of the given data_length. */
    public statsMsg(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new statsMsg with the given data_length
     * and base offset.
     */
    public statsMsg(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new statsMsg using the given byte array
     * as backing store.
     */
    public statsMsg(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new statsMsg using the given byte array
     * as backing store, with the given base offset.
     */
    public statsMsg(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new statsMsg using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public statsMsg(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new statsMsg embedded in the given message
     * at the given base offset.
     */
    public statsMsg(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new statsMsg embedded in the given message
     * at the given base offset and length.
     */
    public statsMsg(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <statsMsg> \n";
      try {
        s += "  [parent=0x"+Long.toHexString(get_parent())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [hopcount=0x"+Long.toHexString(get_hopcount())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [queueOccupancy=0x"+Long.toHexString(get_queueOccupancy())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [controlState=0x"+Long.toHexString(get_controlState())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [dataTraffic_rx=0x"+Long.toHexString(get_dataTraffic_rx())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [controlTraffic_rx=0x"+Long.toHexString(get_controlTraffic_rx())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [controlTraffic_tx=0x"+Long.toHexString(get_controlTraffic_tx())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [loop=0x"+Long.toHexString(get_loop())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [localCongestion=0x"+Long.toHexString(get_localCongestion())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [pinParent=0x"+Long.toHexString(get_pinParent())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: parent
    //   Field type: int, signed
    //   Offset (bits): 0
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'parent' is signed (true).
     */
    public static boolean isSigned_parent() {
        return true;
    }

    /**
     * Return whether the field 'parent' is an array (false).
     */
    public static boolean isArray_parent() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'parent'
     */
    public static int offset_parent() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'parent'
     */
    public static int offsetBits_parent() {
        return 0;
    }

    /**
     * Return the value (as a int) of the field 'parent'
     */
    public int get_parent() {
        return (int)getUIntBEElement(offsetBits_parent(), 16);
    }

    /**
     * Set the value of the field 'parent'
     */
    public void set_parent(int value) {
        setUIntBEElement(offsetBits_parent(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'parent'
     */
    public static int size_parent() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'parent'
     */
    public static int sizeBits_parent() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: hopcount
    //   Field type: int, signed
    //   Offset (bits): 16
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'hopcount' is signed (true).
     */
    public static boolean isSigned_hopcount() {
        return true;
    }

    /**
     * Return whether the field 'hopcount' is an array (false).
     */
    public static boolean isArray_hopcount() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'hopcount'
     */
    public static int offset_hopcount() {
        return (16 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'hopcount'
     */
    public static int offsetBits_hopcount() {
        return 16;
    }

    /**
     * Return the value (as a int) of the field 'hopcount'
     */
    public int get_hopcount() {
        return (int)getUIntBEElement(offsetBits_hopcount(), 16);
    }

    /**
     * Set the value of the field 'hopcount'
     */
    public void set_hopcount(int value) {
        setUIntBEElement(offsetBits_hopcount(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'hopcount'
     */
    public static int size_hopcount() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'hopcount'
     */
    public static int sizeBits_hopcount() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: queueOccupancy
    //   Field type: short, signed
    //   Offset (bits): 32
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'queueOccupancy' is signed (true).
     */
    public static boolean isSigned_queueOccupancy() {
        return true;
    }

    /**
     * Return whether the field 'queueOccupancy' is an array (false).
     */
    public static boolean isArray_queueOccupancy() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'queueOccupancy'
     */
    public static int offset_queueOccupancy() {
        return (32 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'queueOccupancy'
     */
    public static int offsetBits_queueOccupancy() {
        return 32;
    }

    /**
     * Return the value (as a short) of the field 'queueOccupancy'
     */
    public short get_queueOccupancy() {
        return (short)getUIntBEElement(offsetBits_queueOccupancy(), 8);
    }

    /**
     * Set the value of the field 'queueOccupancy'
     */
    public void set_queueOccupancy(short value) {
        setUIntBEElement(offsetBits_queueOccupancy(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'queueOccupancy'
     */
    public static int size_queueOccupancy() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'queueOccupancy'
     */
    public static int sizeBits_queueOccupancy() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: controlState
    //   Field type: short, signed
    //   Offset (bits): 40
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'controlState' is signed (true).
     */
    public static boolean isSigned_controlState() {
        return true;
    }

    /**
     * Return whether the field 'controlState' is an array (false).
     */
    public static boolean isArray_controlState() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'controlState'
     */
    public static int offset_controlState() {
        return (40 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'controlState'
     */
    public static int offsetBits_controlState() {
        return 40;
    }

    /**
     * Return the value (as a short) of the field 'controlState'
     */
    public short get_controlState() {
        return (short)getUIntBEElement(offsetBits_controlState(), 8);
    }

    /**
     * Set the value of the field 'controlState'
     */
    public void set_controlState(short value) {
        setUIntBEElement(offsetBits_controlState(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'controlState'
     */
    public static int size_controlState() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'controlState'
     */
    public static int sizeBits_controlState() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: dataTraffic_rx
    //   Field type: int, signed
    //   Offset (bits): 48
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'dataTraffic_rx' is signed (true).
     */
    public static boolean isSigned_dataTraffic_rx() {
        return true;
    }

    /**
     * Return whether the field 'dataTraffic_rx' is an array (false).
     */
    public static boolean isArray_dataTraffic_rx() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'dataTraffic_rx'
     */
    public static int offset_dataTraffic_rx() {
        return (48 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'dataTraffic_rx'
     */
    public static int offsetBits_dataTraffic_rx() {
        return 48;
    }

    /**
     * Return the value (as a int) of the field 'dataTraffic_rx'
     */
    public int get_dataTraffic_rx() {
        return (int)getUIntBEElement(offsetBits_dataTraffic_rx(), 16);
    }

    /**
     * Set the value of the field 'dataTraffic_rx'
     */
    public void set_dataTraffic_rx(int value) {
        setUIntBEElement(offsetBits_dataTraffic_rx(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'dataTraffic_rx'
     */
    public static int size_dataTraffic_rx() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'dataTraffic_rx'
     */
    public static int sizeBits_dataTraffic_rx() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: controlTraffic_rx
    //   Field type: int, signed
    //   Offset (bits): 64
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'controlTraffic_rx' is signed (true).
     */
    public static boolean isSigned_controlTraffic_rx() {
        return true;
    }

    /**
     * Return whether the field 'controlTraffic_rx' is an array (false).
     */
    public static boolean isArray_controlTraffic_rx() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'controlTraffic_rx'
     */
    public static int offset_controlTraffic_rx() {
        return (64 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'controlTraffic_rx'
     */
    public static int offsetBits_controlTraffic_rx() {
        return 64;
    }

    /**
     * Return the value (as a int) of the field 'controlTraffic_rx'
     */
    public int get_controlTraffic_rx() {
        return (int)getUIntBEElement(offsetBits_controlTraffic_rx(), 16);
    }

    /**
     * Set the value of the field 'controlTraffic_rx'
     */
    public void set_controlTraffic_rx(int value) {
        setUIntBEElement(offsetBits_controlTraffic_rx(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'controlTraffic_rx'
     */
    public static int size_controlTraffic_rx() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'controlTraffic_rx'
     */
    public static int sizeBits_controlTraffic_rx() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: controlTraffic_tx
    //   Field type: int, signed
    //   Offset (bits): 80
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'controlTraffic_tx' is signed (true).
     */
    public static boolean isSigned_controlTraffic_tx() {
        return true;
    }

    /**
     * Return whether the field 'controlTraffic_tx' is an array (false).
     */
    public static boolean isArray_controlTraffic_tx() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'controlTraffic_tx'
     */
    public static int offset_controlTraffic_tx() {
        return (80 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'controlTraffic_tx'
     */
    public static int offsetBits_controlTraffic_tx() {
        return 80;
    }

    /**
     * Return the value (as a int) of the field 'controlTraffic_tx'
     */
    public int get_controlTraffic_tx() {
        return (int)getUIntBEElement(offsetBits_controlTraffic_tx(), 16);
    }

    /**
     * Set the value of the field 'controlTraffic_tx'
     */
    public void set_controlTraffic_tx(int value) {
        setUIntBEElement(offsetBits_controlTraffic_tx(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'controlTraffic_tx'
     */
    public static int size_controlTraffic_tx() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'controlTraffic_tx'
     */
    public static int sizeBits_controlTraffic_tx() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: loop
    //   Field type: byte, signed
    //   Offset (bits): 96
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'loop' is signed (true).
     */
    public static boolean isSigned_loop() {
        return true;
    }

    /**
     * Return whether the field 'loop' is an array (false).
     */
    public static boolean isArray_loop() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'loop'
     */
    public static int offset_loop() {
        return (96 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'loop'
     */
    public static int offsetBits_loop() {
        return 96;
    }

    /**
     * Return the value (as a byte) of the field 'loop'
     */
    public byte get_loop() {
        return (byte)getSIntBEElement(offsetBits_loop(), 8);
    }

    /**
     * Set the value of the field 'loop'
     */
    public void set_loop(byte value) {
        setSIntBEElement(offsetBits_loop(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'loop'
     */
    public static int size_loop() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'loop'
     */
    public static int sizeBits_loop() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: localCongestion
    //   Field type: byte, signed
    //   Offset (bits): 104
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'localCongestion' is signed (true).
     */
    public static boolean isSigned_localCongestion() {
        return true;
    }

    /**
     * Return whether the field 'localCongestion' is an array (false).
     */
    public static boolean isArray_localCongestion() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'localCongestion'
     */
    public static int offset_localCongestion() {
        return (104 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'localCongestion'
     */
    public static int offsetBits_localCongestion() {
        return 104;
    }

    /**
     * Return the value (as a byte) of the field 'localCongestion'
     */
    public byte get_localCongestion() {
        return (byte)getSIntBEElement(offsetBits_localCongestion(), 8);
    }

    /**
     * Set the value of the field 'localCongestion'
     */
    public void set_localCongestion(byte value) {
        setSIntBEElement(offsetBits_localCongestion(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'localCongestion'
     */
    public static int size_localCongestion() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'localCongestion'
     */
    public static int sizeBits_localCongestion() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: pinParent
    //   Field type: byte, signed
    //   Offset (bits): 112
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'pinParent' is signed (true).
     */
    public static boolean isSigned_pinParent() {
        return true;
    }

    /**
     * Return whether the field 'pinParent' is an array (false).
     */
    public static boolean isArray_pinParent() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'pinParent'
     */
    public static int offset_pinParent() {
        return (112 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'pinParent'
     */
    public static int offsetBits_pinParent() {
        return 112;
    }

    /**
     * Return the value (as a byte) of the field 'pinParent'
     */
    public byte get_pinParent() {
        return (byte)getSIntBEElement(offsetBits_pinParent(), 8);
    }

    /**
     * Set the value of the field 'pinParent'
     */
    public void set_pinParent(byte value) {
        setSIntBEElement(offsetBits_pinParent(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'pinParent'
     */
    public static int size_pinParent() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'pinParent'
     */
    public static int sizeBits_pinParent() {
        return 8;
    }

}