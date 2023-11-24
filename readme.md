# Ote builder

## Target result

From a given file (.xslm)
generate a output file .xml

### Steps

1. Get an .xslm file from user input
2. Transform its data from .xslm to .xml
3. Allow to sign the document
4. Generate the .xml output

### User cases

- ✅ The user should be able to upload xlsm files to the application.
- ✅ The application will save the usual path from which the user used to uploads files.
- ✅ Files in non-xlsm formats cannot be loaded.
- ⬜ If multiple files are loaded and one or more do not follow the ENI guidelines to become XLM, those files will not be processed, but the others will.
- ⬜ If a file is not processed, the user will be notified of the files with errors that could not be converted.

## How to run

```bash
   mvn clean javafx:run
```