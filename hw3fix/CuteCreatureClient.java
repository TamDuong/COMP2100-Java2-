
/**
 * CuteCreatureClient program
 * 
 * Tam Duong
 * 02/26/14
 */
public class CuteCreatureClient
{
    public static void main(String[] args)
    {
        CuteCreature b = new EvolvableCuteCreature("Bowlbasore", 1000, 6, 1000, false);
        CuteCreature c = new CuteCreature("Skwer-Tell", 1000, 6, 1000, true);
        CuteCreature d = new CuteCreature("bee", 10, 6, 13500, true);
        EvolvableCuteCreature f = new EvolvableCuteCreature("hello", 10, 6, 10, true);
        
        while (true){   //creature b against d, just to make evolvable creature evolved
            b.attack(d);
            System.out.println();
            if (d.currentHP == 0)
                break;
                
            d.attack(b);
            System.out.println();
            if (b.currentHP == 0)
                break;
        }
        System.out.println(b);
        System.out.println(d);
        
        while (true){   //creature c against d, just to make evolvable creature evolved
            c.attack(d);
            System.out.println();
            if (d.currentHP == 0)
                break;
                
            d.attack(c);
            System.out.println();
            if (c.currentHP == 0)
                break;
        }
        System.out.println(c);
        System.out.println(d);
        
        //evolved creature against an unevolved creature(both creature are level 20 or higher)
        System.out.println(b);
        System.out.println(c);
        while (true){   
            b.elementalAttack(c);
            System.out.println();
            if (c.currentHP == 0)
                break;
                
            c.elementalAttack(b);
            System.out.println();
            if (b.currentHP == 0)
                break;
        }
        System.out.println(b);
        System.out.println(c);
 
    }
}