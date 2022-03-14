using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OCP
{
    class Program
    {
        static void Main(string[] args)
        {
            TypeVehicle type = TypeVehicle.MOTORCYCLE;

            if (type == TypeVehicle.CAR)
            {
                Vehicle v1 = new Vehicle("Azul", 2022, 2.0, 5, 4);
                v1.Car();

            } else
            {
                Vehicle v1 = new Vehicle("Branco", 2023, 250,1, 0);
                v1.Motorcycle();

            }
            Console.ReadLine();
        }     
   
    }
}
