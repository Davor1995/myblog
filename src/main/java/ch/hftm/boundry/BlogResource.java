package ch.hftm.boundry;
 
import java.util.List;

import ch.hftm.control.BlogService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
 

@Path("/blog")
public class BlogResource {
 
    @Inject
    BlogService service;
 
    @GET
    public List<Blog> blog() {
        return service.getBlogs();
    }
 
    @GET
    @Path("new-blog")
    public void addBlog() {
        service.addBlog(new Blog("Hallo Neu", "Blablabla"));
    }
 
 
}
 
 