# Linux script to setup new iDempiere Development environment

## Pre-requisite
* JDK11
* Maven
* Git
* Docker (optionl)

## Usage
* Clone or download to a folder
* At the folder, run ./setup.sh --help to get help on the options available

## What it does
* Clone idempiere source and run Maven build
* Download and setup Eclipse JEE 2019-12
* Create new workspace at the cloned idempiere folder and import all projects into the workspace
* Set target platform and build the workspace
* setup connection properties (idempiere.properties) and jetty server (jettyhome)
* If db doesn't exists yet, import iDempiere db.  
* If db exists, apply migration scripts
* You should have a ready to run Eclipse workspace after the completion of the script

## Other scripts
* Included scrips is usually invoke through setup.sh
* Always use the --help option to get help on the options available
* docker-postgres.sh - scripts to install and run postgres 9.6 docker container
* eclipse.sh - scripts to start eclipse
* rebuild-ws.sh - scripts to invoke headless rebuild of idempiere workspace
* setup-db.sh - scrips to setup connection propertis (idempiere.propertis), jetty server (jettyhome) and import database (if db not exists)/apply migration scripts (if db exists)
* setup-ws.sh - setup idempiere workspace, set target platform and invoke full build of workspace
