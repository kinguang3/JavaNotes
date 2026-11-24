// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package audience;
public class Rectangle {
   double width = (double)1.0F;
   double height = (double)1.0F;

   public Rectangle(double var1, double var3) {
      this.width = var1;
      this.height = var3;
   }

   public double getArea() {
      return this.width * this.height;
   }

   public double getPerimeter() {
      return (double)2.0F * (this.width + this.height);
   }
}
