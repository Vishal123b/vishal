import java.io.*;

class one 
{
void cscs()
{
System.out.println("CSCS");
}
}

class Two extends one 
{
void Deport()
{
System.out.println("department");
}
}

class main1 
{
public static void main (String[]args)
{
Two g=new Two();
g.cscs();
g.depart();
g.cscs();
}
}


