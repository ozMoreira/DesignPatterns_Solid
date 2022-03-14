using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OCP.Vehicles
{
    class Vehicles
    {
    
        protected string color;
        protected int year;
        protected double engine;

        public Vehicles(string color, int year, double engine)
        {
            this.color = color;
            this.year = year;
            this.engine = engine;

        }
        public void StartVehicle()
        {
            Console.WriteLine("Ligando os motores!");
        }
    }
}
