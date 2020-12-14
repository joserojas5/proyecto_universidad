
package Principal;


public class Determinante {
    
    public double detG(double m00,double m10,double m20,double m01,double m11
            ,double m21,double m02,double m12,double m22)
    {
        double detgeneral=0;
        double a1,a2,a3,b1,b2,b3;
        a1 = m00 * m11 * m22;
        a2 = m01 * m12 * m20;
        a3 = m02 * m10 * m21;
        
        b1 = m20 * m11 * m02;
        b2 = m21 * m12 * m00;
        b3 = m22 * m10 * m01;
                
        detgeneral = (a1+a2+a3)-(b1+b2+b3);
        
        return detgeneral;
    }
    public double detX(double m01,double m11
            ,double m21,double m02,double m12,double m22,double m0,double m1, double m2)
    {
        double detgeneral=0;
        double a1,a2,a3,b1,b2,b3;
        
        a1 = m0 * m11 * m22;
        a2 = m01 * m12 * m2;
        a3 = m02 * m1 * m21;
        
        b1 = m2 * m11 * m02;
        b2 = m21 * m12 * m0;
        b3 = m22 * m1 * m01;
                
        detgeneral = (a1+a2+a3)-(b1+b2+b3);
        
        return detgeneral;
    }    
    public double detY(double m00,double m10,double m20,double m02,double m12,
            double m22,double m1,double m2, double m0)
    {
        double detgeneral=0;
        double a1,a2,a3,b1,b2,b3;
        a1 = m00 * m1 * m22;
        a2 = m0 * m12 * m20;
        a3 = m02 * m10 * m2;
        
        b1 = m20 * m1 * m02;
        b2 = m2 * m12 * m00;
        b3 = m22 * m10 * m0;
                
        detgeneral = (a1+a2+a3)-(b1+b2+b3);
        
        return detgeneral;
    }    
    public double detZ(double m00,double m10,double m20,double m01,double m11
            ,double m21,double m02,double m12,double m22,double m1,double m2,
            double m0)
    {
        double detgeneral=0;
        double a1,a2,a3,b1,b2,b3;
        m02 = m0;
        m12 = m1;
        m22 = m2;
        a1 = m00 * m11 * m22;
        a2 = m01 * m12 * m20;
        a3 = m02 * m10 * m21;
        
        b1 = m20 * m11 * m02;
        b2 = m21 * m12 * m00;
        b3 = m22 * m10 * m01;
                
        detgeneral = (a1+a2+a3)-(b1+b2+b3);
        
        return detgeneral;
    }
    public String valores (double detGe,double detX,double detY,double detZ )
    {
        String mensaje = "";
        double x,y,z;
        x= detX / detGe;
        y= detY / detGe;
        z= detZ / detGe;
        mensaje = "x = "+x +" \ny= "+y + " \nz ="+z;
        return mensaje;
    }
}
