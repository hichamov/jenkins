# Shared Libraries

* Shared Libs in jenkins is a collection of groovy scripts that can be reusable by multiple jobs, this allows us to share code and functionalities between different jobs.

* The structure of a shared libs code base looks like the following:

```
.
├── README.md
├── resources
├── shared-libs
│   └── shared-libs.md
├── src
│   └── main
│       └── groovy
│           └── init.groovy
└── vars
    └── init.groovy

6 directories, 4 files
```

* The src directory is structured like a standard java project, this means that you can use the import statement to import classes from other directories in the src directory.
* The vars directory is a special directory that contains global variables that are defined in the shared library, These variables can be accessed from any jenkins jobs that imports the shared library.
* The resource directory is a regular directory that can contain any type of file, however, it is typically used to store static resources that are used by the shared library.


