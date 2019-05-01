# SciFi UI Project

Name: Mariana Pirtac

Student Number: C17378303

# Description of the assignment
My project is going to represent a ui medical interface. The project is going to give an analysis of the human body. There are different graphs displaying different information about the state of the human body. Also, there is a hover function which when you use it you can see the state of the organs. If an organ is healthy it will display blue if it is not healthy it will be displayed red.
There is a function that lets you hear the heartbeat of the human body. Furthermore, you will be able to see the location of the human body.
# Instructions
- To hear the heart beat sound press on the heart. There is a blue outline around the heart you can press anywhere inside it.
- Press 'i' to connect the heart beat to the sine wave at the top, right hand side of the screen.
- To make the sine wave which is placed in the middle of the screen visible just keep the mouse pressed. The sine wave will be displayed only if the heart beat is playing.
- Press on 'p' to make the heart beat stop. 
- Press on 'm' to make the text appear.
- Hover over the location of the 'heart', 'liver', 'stomach', 'right kidney', 'left kidney' to make them display.
# How it works
For this project I used 16 class to create the final UI medical interface.

There is one supers class class called UIEllements and then there are multiple classes(ArtificialID.java, Barchart.java, BodyBackground.java, Button.java, Circle.java, Graph.java, Location.java, Ovals.java, Radar.java,Trinagles.java) which inherit from the super class.

Each of those classes are drawing various shapes. The Circle.java class draws 3 cercles and 2 moving arcs around each circle. I used to pushMatrix and popMatrix to make the arcs rotate. I also used the pushMatrix and popMatrix in the ArtificialID class. The pushMAtrix and popMatrix is used to draw circles made up of dots which represent the artificial ID of a person. 

To draw the graph. I drew the gridlines first and then the lines. I used the map function to map the height of the lines. Underneath the graph there will be random text which will represent the information displayed by each line. The text is stored in a csv file. The code for loading the data and dispalying the text is strored in the Ui class. The text will not be visible at all the times. In order for the text to appprear the user should press on 'm'. I did this using a if statement. To use the text in ui I had to use the getters and setters. In the same csv file I stored the information for the pie chart. That text gets displayed in the same way. The pie chart was drawn in a separate class mainly using arcs. 



# What I am most proud of in the assignment

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

