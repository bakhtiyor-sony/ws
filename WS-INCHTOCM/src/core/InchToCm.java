package core;

import java.text.DecimalFormat;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/temp/xml/inchtocm")

public class InchToCm {

       @GET
       @Path("{input}")
       @Produces("application/xml")

       public String convertCtoFfromInput(@PathParam("input") Double input) {
              DecimalFormat df = new DecimalFormat("####0.00");
              Double inch = input;
              Double cm = inch * 2.54;
              String cm1 = df.format(cm).toString();
              String inch1 = df.format(inch).toString();
        return "<calc>" + "<inch>" + inch1 + "</inch>" + "<cm>" + cm1 + "</cm>" + "</calc>";
      }
}