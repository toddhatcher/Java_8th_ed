
import java.util.*;

public class BowlingTeamDemo2
{
    public static void main(String[] args)
    {
        String name;

        //BowlingTeam bowlTeam = new BowlingTeam();
        final int NUM_TEAMS = 4;
        BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
        int x;
        int y;
        final int NUM_TEAM_MEMBERS = 4;
        Scanner input = new Scanner(System.in);

        for(y = 0; y < NUM_TEAMS; ++y)
        {
            teams[y] = new BowlingTeam();
            System.out.print("Enter team name >> ");
            name = input.nextLine();
            teams[y].setTeamName(name);

            for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
            {
                System.out.print("Enter team member's name >> ");
                name = input.nextLine();
                //bowlTeam.setMember(x, name);
                teams[y].setMember(x, name);
            }
        }

        for(y = 0; y < NUM_TEAMS; ++y)
        {
            System.out.println("\nMembers of team " + teams[y].getTeamName());
            
            for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
            {
                System.out.println(teams[y].getMember(x) + " ");
            }
            System.out.println();
        }
        
    }
}