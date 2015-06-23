public class tools 
{ 
    String main_url;    
    public String correctUrl(String url)
    {        
        main_url=url;
        String temp;
        if(url.contains("http://"))
            return url;
        if(url.contains("www."))
             temp="http://";
        else
            temp="http://www.";   
        
        return temp+url;
    }   
    public String parseUrl(String url)
    { 
        Domain domain=new Domain(main_url);
        //System.out.println("asdasd"+domain.getDomainUrl());
        if(url.equals("#"))
            return "-";
        if(url.contains("#"))
            url=url.substring(0,url.indexOf("#")-1);
        if(url.endsWith("/"))
            url=url.substring(0,url.length()-1);
        
        //remove bookmarks
        if(url.contains("#"))
            url=url.substring(0,url.indexOf("#")-1);
        if(!(url.startsWith("http:")))
        {
            String a=domain.getDomainUrl();
            if(url.startsWith("/"))
            {
                String inal=a+url;
                System.out.println(inal);
                return inal;
            }
            else
            {
                return a+"/"+url;
            }                
        }
        
        return url;
    }
}
