class Player{
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage)
    {
        this.health=this.health - damage;
        if(this.health < 0)
        {
            System.out.println("Player Knocked out...");
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
class EnhancedPlayer{
    private String name;
    private int health=100;
    private String weapon;

    public EnhancedPlayer(String name,int health,String weapon)
    {
        this.name = name;
        if(health > 0 && health<=100)
            this.health = health;
        this.weapon = weapon;
    }

    public void loseHealth(int damage)
    {
        this.health=this.health - damage;
        if(this.health < 0)
        {
            System.out.println("Player Knocked out...");
        }
    }

    public int getHealth()
    {
        return health;
    }
}
public class Encapsulation{
    public static void main(String []args)
    {
        // Player player = new Player();
        // player.name = "Tim";
        // player.health = 20;
        // player.weapon = "Sword";

        // int damage = 10;
        // player.loseHealth(damage);
        // System.out.println("Remaining health = "+player.healthRemaining());

        // damage = 11;
        // player.health = 100;
        // player.loseHealth(damage);
        // System.out.println("Remaining health = "+player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Tim",200,"Sword");
        System.out.println("Initial Health is " + player.getHealth());
    }
}