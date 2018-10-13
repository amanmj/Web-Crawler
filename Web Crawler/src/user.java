import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.HashSet;
import java.util.Iterator;
public class user 
{
    tools obj_tools=new tools();
    public String getUrl()
    {     
        Scanner s=new Scanner(System.in);
        String url=s.next();
        return obj_tools.correctUrl(url);
    }   
    public void startConnection()
    {
        String url=getUrl();
        try 
        {
            HashSet<String> se=new HashSet<String>();
            Document doc = Jsoup.connect(url).get();                       
            Elements a_tag = doc.select("a");
            for(Element a : a_tag)
            {             
                String aa=a.attr("href");
                String parsed=obj_tools.parseUrl(aa);
                if(parsed!="-")
                   se.add(parsed);
            }
            Iterator<String> it=se.iterator();
            while(it.hasNext())
            {
                System.out.println(it.next());
            }
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(webc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
