public class ByteProcessor {


    public static byte[] getBits(byte value) {
        byte[] result = new byte[8];

        if (value < 0) {
            value *= (-1);
            result[0] = 1;
        }

        byte reminder = value;
        byte bytePosition = 7;


        while (reminder > 0) {
            byte valueOnCurrentPosition = getPowerOf2(bytePosition);
            if (valueOnCurrentPosition <= reminder) {
                reminder -= valueOnCurrentPosition;
                result[result.length - bytePosition] = valueOnCurrentPosition;
            }
            bytePosition--;
        }
        return result;
    }

    private static byte getPowerOf2(byte exponent) {
        //if needed below array can be generate automatically
        byte[] powersOfTwo = {0, 1, 2, 4, 8, 16, 32, 64};
        return powersOfTwo[exponent];
    }
}
