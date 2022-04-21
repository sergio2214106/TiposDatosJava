package modelo;

public class Punto 
{
        //---------
        //ATRIBUTOS
        //---------
        private int x;
        private int y;

        //---------
        //--METODOS
        //---------
        public Punto(int x, int y)
        {
            this.x= x;
            this.y= y;

        }

        public void setX(int x) 
        {
            this.x= x;    
        }
        public void setY(int y) 
        {
            this.y= y;    
        }
        public int getX() 
        {
            return x;    
        }
        public int getY() 
        {
            return y;    
        }

        public String toString()
        {
            return "(" + x +", " + y + ") ";
        }
        
}
