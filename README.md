
**-*TUG: GUI Unit Testing ("Testing Unitario GUI", in Spanish) for Qt applications*-** 

TUG is a framework to create batteries of tests for Qt applications. It bases on the Qt Test framework.

The TUG framework is composed of two elements:
* TUGLib: a C++ library to support GUI unit testing (requires Qt 4.8 or higher).
* TUG Wizard: wizard application to create test projects (requires Java RE).


# what does TUG provide?

A video better than a thausand words: https://www.youtube.com/watch?v=tUis6JrycrA

[![TUG VIDEO](http://img.youtube.com/vi/tUis6JrycrA/0.jpg)](http://www.youtube.com/watch?v=tUis6JrycrA)

After 7 steps, 3-5 minutes and no code, you get:
* 1000+ lines of code generated
* test projects ready to compile and run
* only test actions remain to be coded
* all tests and testsuites arranged into a standalone project: 1 test suite = 1 subproject = 1 binary
* high-level, interactive reports on the web browser
* profiling and coverage analysis


# what does a TUG package/release contain?

Releases can be found at "releases/" folder. Each one includes:

* doc/: usage quick guide
* libTUG_project/: C++ project of GUI unit testing library.
* TUG_wizard/: wizard application to create test projects (requires Java RE).
* install.sh: libTUG installer. Type "./install.sh --help" for further info.
   
Please, go to "doc/" folder and open TUG_doc.pdf to find a quick usage guide and 
further information about this testing framework.


# contents of this repository

* doc/ -> Sources of TUG documentation. TUG_doc.pdf includes the docs of this project.
* tug_base_lib/ -> GUI unit testing library sources organized into a QT Creator project.
* LICENSE -> License file.
* README.md -> This file.


# about

TUG project was born with the main purpose of providing a unit testing framework for graphical user interfaces. The main goal was providing developers with a method to easily create a battery of tests for Qt-based applications. The tests had to simulate, as far as possible, users interaction with the interface.

With this purpose, the TUG project is divided into two main components:

* **TUG Wizard**: a wizard-like application that helps developers to create and configure, step by step, a test project aimed at testing a Qt based panel as well as the underlying model and communication classes (if they exists). It generates a new panel inheriting the original one. This new panel includes customized methods to simulate users interaction with the widgets composing the panel. It can also generate a full, standalone test project including testsuites and empty test methods ready for being filled with testing code.

* **TUG Base Library**: a library aimed at supporting the tests generated by TUG Wizard, as well as test projects created manually by developers. It provides a way to structure test suites, as well as a set of methods to support the definition of GUI tests, all around the Qt Test framework.
  
# credits

*The TUG Project is an initiative of Cátedra SAES (http://www.catedrasaes.org) funded by the SAES company
(http://www.electronica-submarina.com). This project and all its components have been designed and developed at University of Murcia (Spain).*
