package crawler;
/**
 * Domain object for url.
 */
public class Domain 
{
    String url;
    Domain(String url)
    {
        this.url=url;
    }
    public String getDomainUrl()
    {   
        return url;        
    }
}
