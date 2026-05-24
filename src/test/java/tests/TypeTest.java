package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pckg.*;

public class TypeTest extends BaseTest{

    @Test(groups = "Type casting")
    public void typeCasting() {
        byte b = 5;
        short s = b;
        int i = s;
        long l = s;
        float f = s;
        double d = s;
        System.out.println("Examples of Widening Type casting...!!");
        System.out.println("byte to short : "+s);
        System.out.println("byte to int : "+i);
        System.out.println("byte to long : "+l);
        System.out.println("byte to float : "+f);
        System.out.println("byte to double : "+d);

        Object objS = s;
        Assert.assertSame(objS.getClass(), Short.class, "s is not short");
    }

    @Test(groups = "Animals")
    public void cowTest() {
        Cow cow = new Cow();
        System.out.println(cow);
        Assert.assertTrue(cow instanceof Herbivore);
    }

    @Test(groups = "Animals")
    public void tigerTest() {
        Tiger tiger = new Tiger();
        System.out.println(tiger);
        Assert.assertTrue(tiger instanceof Predator);
    }

    @Test(groups = "Type casting")
    public void typecastObjectsTest() {
        Bird cobj = new Pinguin();
        Bird par = cobj;
        if (par instanceof Pinguin) {
            System.out.println(
                    "Value accessed through "
                            + "Bird reference with typecasting is "
                            + par.getClass());

            System.out.println("cobj -- " + cobj);
            System.out.println("par -- " + par);
            System.out.println("(Pinguin) cobj -- " + ((Pinguin) cobj));
            System.out.println("(Pinguin) par -- " + ((Pinguin) par));
        }
    }


}
