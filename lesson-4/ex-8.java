import java.util.ArrayList;
public class Main
{
    public static void main(String[] args) {
        System.out.println("Let's play!");
        Shiritori_Game game_1 = new Shiritori_Game();
        game_1.gameShiritori("długopis");
        game_1.gameShiritori("skrzydła");
        game_1.gameShiritori("anakonda");
        game_1.restart();
        System.out.println("New game!");
        game_1.gameShiritori("piłka");
        game_1.gameShiritori("akwarium");
        game_1.gameShiritori("mumia");
        game_1.gameShiritori("mumia");
        game_1.gameShiritori("alfabet");
        game_1.gameShiritori("alfabet");
        game_1.gameShiritori("traktor");
        game_1.gameShiritori("rolnik");
    }
}
class Shiritori_Game
{
    ArrayList<String> Table = new ArrayList<String>();
    boolean start;
    Shiritori_Game()
    {
        this.start=true;
    }
    void restart()
    {
        this.start=true;
        this.Table.clear();
    }
    void display()
    {
        System.out.println(Table);
    }
    void gameShiritori( String Word)
    {
        if(start == true)
        {
            Word = Word.toLowerCase();
            if(Table.contains(Word))
            {
                System.out.println(Word+ " is in the table. Enter the new word.");
                this.display();
            }
            else
            {
                Table.add(Word);
                if(1< Table.size() )
                {
                    int strLen=0;
                    int help = Table.size();
                    String help_2 = Table.get(help-2);
                    strLen = help_2.length();
                    char word_help_2 = help_2.charAt(strLen-1);
                    char word_help = Word.charAt(0);
                    if(word_help == word_help_2 )
                    {
                        this.display();
                    }
                    else
                    {
                        System.out.println("Incorrect word!");
                        this.display();
                        this.start=false;
                    }}}}
        else
        {
            System.out.println("Please restart!");
        }}}

