# BibTex Parser
![](./BibTeX_logo.svg.png)

BibTex Parser reads content of any BibTex (https://en.wikipedia.org/wiki/BibTeX) file (*.bib) and converts a text form to an object one. 

##Functionnality

- Using object form displays result data as tables with borders in the form of ASCII characters. 
- For the input BibTex document, detects records and interpret their content. 
- Handles fields (required, optional, ignored)
- Generates an exception in the absence of required fields
- Includes information in optional fields
- Suppresses information contained in ignored fields
- Includes string variables - support the @string declaration
- Removes from the text all other unnecessary elements: field delimiters, @comment and @preamble declarations, fragments containing no records or declarations
- Display of all literature (publications)
- Searching for publications belonging to given categories, e.g. all 'book' and 'article' types
- Searching for publications of a given author or authors
