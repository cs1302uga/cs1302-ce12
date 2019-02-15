# cs1302-ce12

> One Ring to rule them all, One Ring to find them [...]
> **--J.R.R. Tolkien's epigraph to _The Lord of the Rings_**

This class exercise explores TBD...

## Prerequisite Knowledge

* Reference variables.
* [`Object` API Documentation](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html)

## Questions

In your notes, clearly answer the following questions. These instructions assume that you are 
logged into the Nike server. 

**NOTE:** If a step requires you to enter in a command, please provide in your notes the full 
command that you typed to make the related action happen. If context is necessary (e.g., the 
command depends on your present working directory), then please note that context as well.

### Getting Started

1. Use Git to clone the repository for this exercise onto Nike into a subdirectory called `cs1302-ce12`:

   ```
   $ git clone --depth 1 https://github.com/cs1302uga/cs1302-ce12.git
   ```

1. Change into the `cs1302-ce12` directory that was just created and look around. There should be
   multiple Java files contained within the directory structure. To see a listing of all of the 
   files under the `src` subdirectory, use the `find` command as follows:
   
   ```
   $ find src
   ```

   For each Java file under the `src` subdirectory, fill out a table similar to the following:
   
   | File Name | Java Type? | FQN | Depends On | Line Count |
   |-----------|------------|-----|------------|------------|
   |-----------|------------|-----|------------|------------|
   |-----------|------------|-----|------------|------------|
   |-----------|------------|-----|------------|------------|

   The "Java Type" column should list the outermost type in the file (e.g., class, interface, enum, etc). 
   The "Depends On" column should list any Java types in the starter code that the file
   is dependent upon. To determine the "Line Count", you may use the `wc` command.
   
1. In your notes, draw a complete, proper UML diagram for all of the code contained in the
   starter code. You might need to devote an entire page to this. We recommend using a pencil.
   Be sure to include generalization (`extends`), realization (`implements`), and 
   dependency arrows. Do not list inherited members unless they are explicitly overriden.
   
1. Compile all of the starter code and run the `cs1302.ce12.Driver` class.
   What is the output?
   
1. It looks like there might be some redundancy among the different container classes.
   In your notes, draw a new UML diagram that reduces the overall redundancy by adding
   or removing classes and interfaces and making use of appropriate inter-class
   associations. 
   
1. How does your redesign reduce redundancy? Justify your answer. 

   **NOTE:** If the instructor or PLA thinks that further redundancy can be eliminated, then 
   they may ask you to repeat these last two steps before signing off your checkpoint. If you're 
   asked to repeat the last two steps, then don't scratch your work! Keep your existing designs
   and notes available so that you can reflect on the evolution of your design choices.

**CHECKPOINT**

1. Make sure you are in the `cs1302-ce12` directory. Delete the code for the container classes 
   using Git and the `rm` command:
   
   ```
   $ git rm -rf src/cs1302/ce12/*Container.java
   ```
   
1. What is the complete output of the Git `status` command?

1. Commit the changes to your local copy of the repository. 
   Be sure to include a good log message.

1. Write the code to implement you approved design from the previous checkpoint. 
   Make sure that any types you create are in the `cs1302.ce12` package. 
   Before you continue, make sure your code compiles.
   
1. Tell Git to track the `.java` files you just created.
   What command can be used to tell that they are now tracked?
   
1. Commit the changes to your local copy of the exercise repository.
   Be sure to include a good log message.
   
1. Modify the `cs1302.ce12.Driver` class to utilize your redesign.

1. If you encounter any compililation errors:

   1. Write the error down in your notes;
   1. Fix the error in your code;
   1. Recompile; then
   1. Note the fix in your notes.
   1. Repeat as needed.

1. Commit the changes to your local copy of the exercise repository.
   Be sure to include a good log message.

1. What is the output of running the `cs1302.ce12.Driver` class?
   Did the output match the output of the original driver?

**CHECKPOINT**


**NOT A CHECKPOINT**

<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Brad Barnes, and the University of Georgia.
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
