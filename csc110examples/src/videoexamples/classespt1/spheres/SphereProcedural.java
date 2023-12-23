package videoexamples.classespt1.spheres;

import java.util.Scanner;

//  Compute the volume and surface area of a sphere given its radius.
public class SphereProcedural
{ 
   public static void main (String[] args)
   {
        double radius, surfaceArea, volume;
        Scanner sc = new Scanner(System.in);

        System.out.println ("Welcome to the Sphere Calculator." );
        System.out.print ("Enter the sphere's radius: ");
        radius = sc.nextDouble();

        volume = 4.0 / 3.0 * Math.PI * Math.pow(radius, 3); 
        surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
	
        System.out.println ("Radius: " + radius );
        System.out.println ("Volume: " + volume );
        System.out.println ("Surface area: " + surfaceArea );
    }
}

