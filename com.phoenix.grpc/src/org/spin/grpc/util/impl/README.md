### GRPC Implementation Classes

- Access Server `(port 50050)`
- Business Data Server `(port <add later>)`
- Enrollment Server `(port 50047)`
- Dictionary Server `(port 50051)`

#### Notes
- When porting from [adempiere-grpc](https://github.com/erpcya/adempiere-gRPC-Server), some of the models are not available in idempiere that are available in adempiere or customization done by the libarary done by the adempiere server plugin. The plan is to continue porting the library and when there is problem from the models not defined in idempiere we copy the models with same schema names and everything into idempiere.
    - `MADToken` and `MADTokenDefinition` table has been ported into idempiere for `Enrollment Server`. Current data present in adempiere server has not been seeded into the idempiere. If needed seeding should be done. 

- Business data server contains various services attached with it. like;
    - Business Data Service `BusinessDataServiceImplementation.java` `[ported]`
    - Core Functionality `CoreFunctionalityImplementation.java` `[ported]`
    - User Interface `UserInterfaceServiceImplementation.java` `[]`
    - Dashboarding `DashboardingServiceImplementation.java`
    - Workflow `WorkflowServiceImplementation.java`
    
- `ConverterUtil` file `convertResourceReference` and `convertAttachment` are to be ported later.
- `UserInterfaceServiceImplementation` check commented packages and commented models for remaining porting into idempiere.

- `idempiere` PO and `adempiere` PO has some minor differences like; `getUUID` method not present and static values `COLUMNNAME_UU` contained uuid but in idempiere `COLUMNNAME_<tablename>_UU` contains. These minor differences has to be ported into idempiere. (the main purpose of this project is to do the same as well).