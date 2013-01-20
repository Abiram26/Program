/*    */ package pythagorean;
/*    */ 
/*    */ import javax.swing.JOptionPane;
/*    */ 
/*    */ public class volumeCalc
/*    */ {
/*    */   public void rTheorem()
/*    */   {
/* 22 */     String a = JOptionPane.showInputDialog("Type in the length of the base");
/* 23 */     String b = JOptionPane.showInputDialog("Type in the width of the base");
			 String c = JOptionPane.showInputDialog("Type in the height");
/*    */ 
/* 25 */     double a2 = Float.parseFloat(a);
/* 26 */     double b2 = Float.parseFloat(b);
             double cP = Float.parseFloat(c);
/* 29 */     double c2 = a2 * b2 * cP;
/* 30 */     double cS = c2 / 3;
/*    */ 
/* 33 */     JOptionPane.showMessageDialog(null, "Volume is equal to " + cS, "Volume Pyramid", -1);
/*    */ 
/* 35 */     menu selMethod = new menu();
/* 36 */     selMethod.menuMethod();
/*    */   }
/*    */   public void uTheorem() {
	/* 39 */     String a = JOptionPane.showInputDialog("Type in the length");
	/* 40 */     String b = JOptionPane.showInputDialog("Type in the width");
			     String c = JOptionPane.showInputDialog("Type in the height");
	/*    */ 
	/* 42 */     double a2 = Float.parseFloat(a);
	/* 43 */     double b2 = Float.parseFloat(b);
				 double cS = Float.parseFloat(c);
	/* 46 */     double c2 = a2 * b2 * cS;
	/*    */ 
	/* 51 */     JOptionPane.showMessageDialog(null, "Volume is equal to " + c2, "Volume Cube/Cuboid", -1);
	/*    */ 
	/* 53 */     menu selMethod = new menu();
	/* 54 */     selMethod.menuMethod();
	/*    */   }
public void irTheorem() { //ir is inverted rounded, for calculating A or B
	/* 39 */     String a = JOptionPane.showInputDialog("Type in the diameter");
	/*    */ 
	/* 42 */     double a2 = Float.parseFloat(a);
	/* 43 */     double b2 = 3.1415926535897932384;
				 double cP = a2 / 2;
	/* 46 */     double c2 = Math.pow(cP, 3);
	/* 47 */     double cS = b2 * c2 * 4 / 3;
	/*    */ 
	/* 51 */     JOptionPane.showMessageDialog(null, "Volume is equal to " + cS, "Volume Sphere using Diameter", -1);
	/*    */ 
	/* 53 */     menu selMethod = new menu();
	/* 54 */     selMethod.menuMethod();
	/*    */   }

public void iuTheorem() { //iu is inverted unrounded, for calculating A or B
	/* 39 */     String a = JOptionPane.showInputDialog("Type in the radius");
	/*    */ 
	/* 42 */     double a2 = Float.parseFloat(a);
	/* 43 */     double b2 = 3.1415926535897932384;
	/* 46 */     double c2 = Math.pow(a2, 3);
	/* 47 */     double cS = b2 * c2 * 4 / 3;
	/*    */ 
	/* 51 */     JOptionPane.showMessageDialog(null, "Volume is equal to " + cS, "Volume Sphere using Radius", -1);
	/*    */ 
	/* 53 */     menu selMethod = new menu();
	/* 54 */     selMethod.menuMethod();
	/*    */   }
public void iuaTheorem() { //ir is inverted rounded, for calculating A or B
	/* 39 */     String a = JOptionPane.showInputDialog("Type in the radius");
	/* 40 */     String b = JOptionPane.showInputDialog("Type in height");
	/*    */ 
	/* 42 */     double a2 = Float.parseFloat(a);
	/* 43 */     double b2 = 3.1415926535897932384;
	             double cP = Float.parseFloat(b);
	/* 46 */     double c2 = Math.pow(a2, 2);
	/* 47 */     double cS = b2 * c2 * cP;
	/*    */ 
	/* 51 */     JOptionPane.showMessageDialog(null, "Volume is equal to " + cS, "Volume Cylinder using Radius", -1);
	/*    */ 
	/* 53 */     menu selMethod = new menu();
	/* 54 */     selMethod.menuMethod();
	/*    */   }

public void iraTheorem() { //iu is inverted unrounded, for calculating A or B
	/* 39 */     String a = JOptionPane.showInputDialog("Type in the diameter");
	/* 40 */     String b = JOptionPane.showInputDialog("Type in height");
	/*    */ 
	/* 42 */     double a2 = Float.parseFloat(a);
	/* 43 */     double b2 = 3.1415926535897932384;
				 double cL = Float.parseFloat(b);
	 			 double cP = a2 / 2;
/* 46 */     	 double c2 = Math.pow(cP, 2);
/* 47 */     	 double cS = b2 * c2 * cL;
	/*    */ 
	/* 51 */     JOptionPane.showMessageDialog(null, "Volume is equal to " + cS, "Volume Cylinder using Diameter", -1);
	/*    */ 
	/* 53 */     menu selMethod = new menu();
	/* 54 */     selMethod.menuMethod();
	/*    */   }
public void iubTheorem() { //ir is inverted rounded, for calculating A or B
	/* 39 */     String a = JOptionPane.showInputDialog("Type in the radius");
	/* 40 */     String b = JOptionPane.showInputDialog("Type in height");
	/*    */ 
	/* 42 */     double a2 = Float.parseFloat(a);
	/* 43 */     double b2 = 3.1415926535897932384;
	             double cP = Float.parseFloat(b);
	/* 46 */     double c2 = Math.pow(a2, 2);
	/* 47 */     double cS = b2 * c2 * cP / 3;
	/*    */ 
	/* 51 */     JOptionPane.showMessageDialog(null, "Volume is equal to " + cS, "Volume Cone using Radius", -1);
	/*    */ 
	/* 53 */     menu selMethod = new menu();
	/* 54 */     selMethod.menuMethod();
	/*    */   }

public void irbTheorem() { //iu is inverted unrounded, for calculating A or B
	/* 39 */     String a = JOptionPane.showInputDialog("Type in the diameter");
	/* 40 */     String b = JOptionPane.showInputDialog("Type in height");
	/*    */ 
	/* 42 */     double a2 = Float.parseFloat(a);
	/* 43 */     double b2 = 3.1415926535897932384;
				 double cL = Float.parseFloat(b);
	 			 double cP = a2 / 2;
/* 46 */     	 double c2 = Math.pow(cP, 2);
/* 47 */     	 double cS = b2 * c2 * cL / 3;
	/*    */ 
	/* 51 */     JOptionPane.showMessageDialog(null, "Volume is equal to " + cS, "Volume Cone using Diameter", -1);
	/*    */ 
	/* 53 */     menu selMethod = new menu();
	/* 54 */     selMethod.menuMethod();
	/*    */   }
/*    */ }

/* Location:           C:\A\Math App\Geometry Calculator-ALPHA-0.4.4.jar
 * Qualified Name:     pythagorean.roundedTheorem
 * JD-Core Version:    0.6.2
 */