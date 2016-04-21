/*
 * File: GraphicsHierarchy.java
 * ----------------------------
 * This program is a stub for the GraphicsHierarchy problem, which
 * draws a partial diagram of the acm.graphics hierarchy.
 */

// More graphics, more libraries.
import acm.program.*;
import acm.graphics.*;

public class GraphicsHierarchy extends GraphicsProgram
{
	
	// These are the heights for our layers of boxes.
	int highbox, lowbox;
	
	// The widths for each box.
	int progbox;
	int grapbox;
	int consbox;
	int dialbox;
	
	public void run()
	{
		
		// We make our new labels. We'll set the positions later.
		GLabel prog, grap, cons, dial;
		
		prog = new GLabel("Program");
		grap = new GLabel("GraphicsProgram");
		cons = new GLabel("ConsoleProgram");
		dial = new GLabel("DialogProgram");
		
		// Then we make new rectangles, again with no positions.
		GRect progr, grapr, consr, dialr;
		
		progr = new GRect(0, 0, 0, 0);
		grapr = new GRect(0, 0, 0, 0);
		consr = new GRect(0, 0, 0, 0);
		dialr = new GRect(0, 0, 0, 0);
		
		// Then the lines.
		GLine proggrap, progcons, progdial;
		
		proggrap = new GLine(0, 0, 0, 0);
		progcons = new GLine(0, 0, 0, 0);
		progdial = new GLine(0, 0, 0, 0);
		
		
		// We add them all to the default canvas.
		add(proggrap);
		add(progcons);
		add(progdial);
		
		add(progr);
		add(grapr);
		add(consr);
		add(dialr);
		
		add(prog);
		add(grap);
		add(cons);
		add(dial);
		
		// Again, we use a while loop to constantly update the graphics.
		while(true)
		{
			
			// We set all our variables.
			highbox = getHeight() / 3;
			lowbox = getHeight() / 3 * 2;
			
			progbox = getWidth() / 2;
			grapbox = getWidth() / 3;
			consbox = getWidth() / 2;
			dialbox = getWidth() / 3 * 2;
			
			// Then set them all.
			prog.setLocation( progbox - (prog.getWidth() / 2), highbox - prog.getAscent() );
			grap.setLocation( grapbox - (grap.getWidth() / 2) ,  lowbox - grap.getAscent() );
			cons.setLocation( consbox - (cons.getWidth() / 2) ,  lowbox - cons.getAscent() );
			dial.setLocation( dialbox - (dial.getWidth() / 2) ,  lowbox - dial.getAscent() );
			
			// Each carefully calculates it's positions based on objects that appear
			// above them on the canvas.
			progr.setSize(prog.getWidth() + 60, prog.getAscent() + 20);
			grapr.setSize(grap.getWidth() + 60, grap.getAscent() + 20);
			consr.setSize(cons.getWidth() + 60, cons.getAscent() + 20);
			dialr.setSize(dial.getWidth() + 60, dial.getAscent() + 20);
			
			// This assures the program appears relatively the same, even if resized
			// (or you change the text in the boxes).
			progr.setLocation(progbox - (progr.getWidth() / 2), highbox - progr.getHeight() );
			grapr.setLocation(grapbox - (grapr.getWidth() / 2), lowbox - grapr.getHeight() );
			consr.setLocation(consbox - (consr.getWidth() / 2), lowbox - consr.getHeight() );
			dialr.setLocation(dialbox - (dialr.getWidth() / 2), lowbox - dialr.getHeight() );
			
			proggrap.setStartPoint(progbox, highbox );
			proggrap.setEndPoint(grapbox, lowbox - grapr.getHeight() );
			progcons.setStartPoint(progbox, highbox );
			progcons.setEndPoint(consbox, lowbox - consr.getHeight() );
			progdial.setStartPoint(progbox, highbox );
			progdial.setEndPoint(dialbox, lowbox - dialr.getHeight() );
			
		}
		
	}

}
