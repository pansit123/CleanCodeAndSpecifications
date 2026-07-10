package lab;

/**
 * ==========================================================================
 *  ส่วน B — ฝึกเขียน Spec (JavaDoc) เอง
 * --------------------------------------------------------------------------
 *  โค้ดข้างล่างนี้ "ทำงานถูกต้องแล้ว" — ห้ามแก้ตัวโค้ด
 *  หน้าที่ของนิสิต: อ่านโค้ด แล้วเติม JavaDoc ให้แต่ละเมธอด
 *
 *  ต้องมีอย่างน้อย:
 *    - บรรทัดสรุปว่าเมธอด "ทำอะไร" (what, ไม่ใช่ how)
 *    - @param   ของทุกพารามิเตอร์ พร้อมข้อจำกัด (pre-condition)
 *    - @return  อธิบายค่าที่คืน (post-condition)
 *    - @throws  ทุก exception ที่โยน พร้อมเงื่อนไข
 * ==========================================================================
 */
public class Specs {

  /**
   * ทำงาน ค้นหาตำแหน่งของindex
   * @param arr อาเรย์ที่ต้องการต้องไมเป็น null
   * @param key ค่าที่ต้องการค้นหา
   * @return -1ถ้าไม่เจอ
   * @throws  IllegalArgumentException ถ้าอาเรย์เป็นnull
   */
    public static int firstIndexOf(int[] arr, int key) {
        if (arr == null) throw new IllegalArgumentException("arr must not be null");
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key) return i;
        return -1;
    }

    // TODO ข้อ 5: เขียน JavaDoc ให้เมธอดนี้
    /**
     * คำนวณหาค่าวงกลม
     * @param radius รัศมีวงกลมต้องมีค่ามากกว่าหรือเท่ากับ0
     * @return พื้นที่วงกลม
     * @throws IllegalArgumentException รัศมีมีค่ามากกว่าหรือเท่ากับ0
     */
    public static double circleArea(double radius) {
        if (radius < 0) throw new IllegalArgumentException("radius must be >= 0");
        return Math.PI * radius * radius;
    }

    // TODO ข้อ 6: เขียน JavaDoc ให้เมธอดนี้
    /**
     * 
     * @param s ข้อความปรับรูปแบบสามารถเป็นnullได้
     * @return เปลี่ยนเป็นตัวพิมพ์เล็กหรือคืนสตริงว่าง null 
     */
    //   (เมธอดนี้ตัดช่องว่างหน้า-หลัง แล้วแปลงเป็นตัวพิมพ์เล็ก;
    //    input null ให้คืน string ว่าง)
    public static String normalize(String s) {
        if (s == null) return "";
        return s.trim().toLowerCase();
    }
}
