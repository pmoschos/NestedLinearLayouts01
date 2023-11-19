# Nested Linear Layouts - OnClickListeners - Toast messages

## Introduction :sparkles:
We use linear layouts with orientation horizontal and vertical. 
Also, we use weightSum attribute. 
We add OnClickListeners on the buttons and on `button click` we display useful Toast messages!

## Our Application
![image](https://github.com/pmoschos/NestedLinearLayouts/assets/133533759/101471a2-4d93-45ff-9032-9abc90eef128)

## Layout :art:
The activity uses a `LinearLayout` with vertical orientation, divided into multiple sections, each containing buttons representing different programming languages and technologies.

### TextView - Title
- **ID:** `@+id/titleTV`
- **Text:** "Coding Factory"
- **Style:** Bold, centered, with a gray background.
- **Size:** 36sp

### Programming Language Buttons
Each button is designed to represent a different programming language or technology. The layout is divided into four rows, each containing two buttons.

#### Row 1
- **Java Button**
  - **ID:** `@+id/javaBtn`
  - **Text Size:** 24sp

- **C# Button**
  - **ID:** `@+id/csharpBtn`
  - **Text Size:** 24sp

#### Row 2
- **Python Button**
  - **ID:** `@+id/pythonBtn`
  - **Text Size:** 24sp

- **Php Button**
  - **ID:** `@+id/phpBtn`
  - **Text Size:** 24sp

#### Row 3
- **Javascript Button**
  - **ID:** `@+id/javascriptBtn`
  - **Text Size:** 24sp

- **Angular Button**
  - **ID:** `@+id/angularBtn`
  - **Text Size:** 24sp

#### Row 4
- **SQL Button**
  - **ID:** `@+id/sqlBtn`
  - **Text Size:** 24sp

- **MongoDB Button**
  - **ID:** `@+id/mongodbBtn`
  - **Text Size:** 24sp

### TextView - Footer
- **ID:** `@+id/androidTV`
- **Text:** "Android Development"
- **Style:** Bold, centered, with a gray background.
- **Size:** 20sp

## Functionality :gear:
Each button in the `ThirdActivity` is linked to an event listener that triggers a Toast message specific to the button's programming language or technology.

### Event Listeners
- **Java Button:** Displays "Hello Java!"
- **C# Button:** Displays "Hello C#!"
- **Python Button:** Displays "Hello Python!"
- **Php Button:** Displays "Hello Php!"
- **Javascript Button:** Displays "Hello Javascript!"
- **Angular Button:** Displays "Hello Angular!"
- **SQL Button:** Displays "Hello SQL!"
- **MongoDB Button:** Displays "Hello MONGODB!"

These Toast messages serve as placeholders for future functionality related to each language or technology.

## Conclusion :bookmark_tabs:
It is an interactive and educational application which introduces students in: 
- **Nested Linear Layouts**
- **OnClickListeners**
- **Toast messages**



