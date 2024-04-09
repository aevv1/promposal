import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        //first
        JOptionPane.showMessageDialog(null, 
        "Hello! Before I ask you something side notes or messages lang", 
        "intro", 
        JOptionPane.PLAIN_MESSAGE);

        //second
        JOptionPane.showMessageDialog(null, 
        "I'm not doing this because i'm holding onto something", 
        ":)", 
        JOptionPane.PLAIN_MESSAGE);

        //third
        JOptionPane.showMessageDialog(null, 
        "I'm doing this just because I want to, and I've been thinking about this since I found out", 
        ":)", 
        JOptionPane.PLAIN_MESSAGE);


        //third
        JOptionPane.showMessageDialog(null, 
        "It sounds so desperate but I'll shoot my shot", 
        ":)", 
        JOptionPane.PLAIN_MESSAGE);

        //option
        String []choice={"i'll think abt it", "no", "yes"};
        JOptionPane.showOptionDialog
       (null,
       "Will you sama to kp w us?",
       "promposal",
       JOptionPane.YES_NO_CANCEL_OPTION,
       JOptionPane.QUESTION_MESSAGE,
       null,
       choice,
       0);
    }
}
