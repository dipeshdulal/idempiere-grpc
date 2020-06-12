// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: access.proto

package org.spin.grpc.util;

public final class ADempiereAccess {
  private ADempiereAccess() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_access_LoginRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_access_LoginRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_access_LogoutRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_access_LogoutRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_access_SessionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_access_SessionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_access_ChangeRoleRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_access_ChangeRoleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_access_UserInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_access_UserInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_access_UserInfoValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_access_UserInfoValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_access_UserInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_access_UserInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_access_Session_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_access_Session_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_access_Session_DefaultContextEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_access_Session_DefaultContextEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_access_ContextValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_access_ContextValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_access_Role_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_access_Role_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_access_Access_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_access_Access_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_access_TableAccess_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_access_TableAccess_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_access_ColumnAccess_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_access_ColumnAccess_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_access_RecordAccess_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_access_RecordAccess_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_access_Menu_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_access_Menu_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014access.proto\022\006access\"\236\001\n\014LoginRequest\022" +
      "\020\n\010userName\030\002 \001(\t\022\020\n\010userPass\030\003 \001(\t\022\020\n\010r" +
      "oleUuid\030\004 \001(\t\022\030\n\020organizationUuid\030\005 \001(\t\022" +
      "\025\n\rwarehouseUuid\030\006 \001(\t\022\025\n\rclientVersion\030" +
      "\007 \001(\t\022\020\n\010language\030\010 \001(\t\"M\n\rLogoutRequest" +
      "\022\023\n\013sessionUuid\030\001 \001(\t\022\020\n\010language\030\002 \001(\t\022" +
      "\025\n\rclientVersion\030\003 \001(\t\"<\n\016SessionRequest" +
      "\022\023\n\013sessionUuid\030\001 \001(\t\022\025\n\rclientVersion\030\002" +
      " \001(\t\"\224\001\n\021ChangeRoleRequest\022\023\n\013sessionUui" +
      "d\030\001 \001(\t\022\020\n\010roleUuid\030\002 \001(\t\022\030\n\020organizatio",
      "nUuid\030\003 \001(\t\022\025\n\rwarehouseUuid\030\004 \001(\t\022\020\n\010la" +
      "nguage\030\005 \001(\t\022\025\n\rclientVersion\030\006 \001(\t\"\222\001\n\017" +
      "UserInfoRequest\022\023\n\013sessionUuid\030\001 \001(\t\022\020\n\010" +
      "roleUuid\030\002 \001(\t\022\030\n\020organizationUuid\030\003 \001(\t" +
      "\022\025\n\rwarehouseUuid\030\004 \001(\t\022\020\n\010language\030\005 \001(" +
      "\t\022\025\n\rclientVersion\030\006 \001(\t\"P\n\rUserInfoValu" +
      "e\022\"\n\010userInfo\030\001 \001(\0132\020.access.UserInfo\022\033\n" +
      "\005roles\030\002 \003(\0132\014.access.Role\"Y\n\010UserInfo\022\n" +
      "\n\002id\030\001 \001(\005\022\014\n\004uuid\030\002 \001(\t\022\014\n\004name\030\003 \001(\t\022\023" +
      "\n\013description\030\004 \001(\t\022\020\n\010comments\030\005 \001(\t\"\216\002",
      "\n\007Session\022\n\n\002id\030\001 \001(\005\022\014\n\004uuid\030\002 \001(\t\022\014\n\004n" +
      "ame\030\003 \001(\t\022\"\n\010userInfo\030\004 \001(\0132\020.access.Use" +
      "rInfo\022\032\n\004role\030\005 \001(\0132\014.access.Role\022\021\n\tpro" +
      "cessed\030\006 \001(\010\022;\n\016defaultContext\030\007 \003(\0132#.a" +
      "ccess.Session.DefaultContextEntry\032K\n\023Def" +
      "aultContextEntry\022\013\n\003key\030\001 \001(\t\022#\n\005value\030\002" +
      " \001(\0132\024.access.ContextValue:\0028\001\"\203\002\n\014Conte" +
      "xtValue\022\020\n\010intValue\030\001 \001(\005\022\021\n\tlongValue\030\002" +
      " \001(\003\022\023\n\013doubleValue\030\003 \001(\001\022\024\n\014booleanValu" +
      "e\030\004 \001(\010\022\023\n\013stringValue\030\005 \001(\t\0221\n\tvalueTyp",
      "e\030\006 \001(\0162\036.access.ContextValue.ValueType\"" +
      "[\n\tValueType\022\010\n\004NULL\020\000\022\013\n\007INTEGER\020\001\022\010\n\004L" +
      "ONG\020\002\022\n\n\006DOUBLE\020\003\022\013\n\007BOOLEAN\020\004\022\n\n\006STRING" +
      "\020\005\022\010\n\004DATE\020\006\"\361\004\n\004Role\022\n\n\002id\030\001 \001(\005\022\014\n\004uui" +
      "d\030\002 \001(\t\022\014\n\004name\030\003 \001(\t\022\023\n\013description\030\004 \001" +
      "(\t\022\020\n\010clientId\030\005 \001(\005\022\022\n\nclientName\030\006 \001(\t" +
      "\022\023\n\013isCanReport\030\007 \001(\010\022\023\n\013isCanExport\030\010 \001" +
      "(\010\022\026\n\016isPersonalLock\030\t \001(\010\022\030\n\020isPersonal" +
      "Access\030\n \001(\010\022%\n\rorganizations\030\013 \003(\0132\016.ac" +
      "cess.Access\022\037\n\007windows\030\014 \003(\0132\016.access.Ac",
      "cess\022\037\n\007process\030\r \003(\0132\016.access.Access\022\035\n" +
      "\005forms\030\016 \003(\0132\016.access.Access\022 \n\010browsers" +
      "\030\017 \003(\0132\016.access.Access\022!\n\tworkflows\030\020 \003(" +
      "\0132\016.access.Access\022\035\n\005tasks\030\021 \003(\0132\016.acces" +
      "s.Access\022\"\n\ndashboards\030\022 \003(\0132\016.access.Ac" +
      "cess\022\'\n\017documentActions\030\023 \003(\0132\016.access.A" +
      "ccess\022#\n\006tables\030\024 \003(\0132\023.access.TableAcce" +
      "ss\022%\n\007columns\030\025 \003(\0132\024.access.ColumnAcces" +
      "s\022%\n\007records\030\026 \003(\0132\024.access.RecordAccess" +
      "\":\n\006Access\022\014\n\004uuid\030\001 \001(\t\022\022\n\nisReadOnly\030\002",
      " \001(\010\022\016\n\006action\030\003 \001(\t\"\331\001\n\013TableAccess\022\021\n\t" +
      "tableName\030\001 \001(\t\022\021\n\tisExclude\030\002 \001(\010\022\023\n\013is" +
      "CanReport\030\003 \001(\010\022\023\n\013isCanExport\030\004 \001(\010\022;\n\017" +
      "accessTypeRules\030\005 \001(\0162\".access.TableAcce" +
      "ss.AccessTypeRule\"=\n\016AccessTypeRule\022\r\n\tA" +
      "CCESSING\020\000\022\r\n\tEXPORTING\020\001\022\r\n\tREPORTING\020\002" +
      "\"\\\n\014ColumnAccess\022\021\n\ttableName\030\001 \001(\t\022\022\n\nc" +
      "olumnName\030\002 \001(\t\022\021\n\tisExclude\030\003 \001(\010\022\022\n\nis" +
      "ReadOnly\030\004 \001(\010\"\213\001\n\014RecordAccess\022\021\n\ttable" +
      "Name\030\001 \001(\t\022\020\n\010recordId\030\002 \001(\005\022\022\n\nrecordUu",
      "id\030\003 \001(\t\022\021\n\tisExclude\030\004 \001(\010\022\022\n\nisReadOnl" +
      "y\030\005 \001(\010\022\033\n\023isDependentEntities\030\006 \001(\010\"\370\001\n" +
      "\004Menu\022\n\n\002id\030\001 \001(\005\022\014\n\004uuid\030\002 \001(\t\022\022\n\nparen" +
      "tUuid\030\004 \001(\t\022\014\n\004name\030\005 \001(\t\022\023\n\013description" +
      "\030\006 \001(\t\022\020\n\010sequence\030\007 \001(\t\022\022\n\nisReadOnly\030\010" +
      " \001(\010\022\021\n\tisSummary\030\t \001(\010\022\017\n\007isSOTrx\030\n \001(\010" +
      "\022\016\n\006action\030\013 \001(\t\022\025\n\rreferenceUuid\030\014 \001(\t\022" +
      "\034\n\006childs\030\r \003(\0132\014.access.Menu\022\020\n\010isActiv" +
      "e\030\016 \001(\0102\356\003\n\010Security\022<\n\013GetUserInfo\022\024.ac" +
      "cess.LoginRequest\032\025.access.UserInfoValue",
      "\"\000\0223\n\010RunLogin\022\024.access.LoginRequest\032\017.a" +
      "ccess.Session\"\000\022:\n\017RunLoginDefault\022\024.acc" +
      "ess.LoginRequest\032\017.access.Session\"\000\0225\n\tR" +
      "unLogout\022\025.access.LogoutRequest\032\017.access" +
      ".Session\"\000\022J\n\026GetUserInfoFromSession\022\027.a" +
      "ccess.UserInfoRequest\032\025.access.UserInfoV" +
      "alue\"\000\022:\n\017GetMenuAndChild\022\027.access.UserI" +
      "nfoRequest\032\014.access.Menu\"\000\022;\n\rRunChangeR" +
      "ole\022\027.access.UserInfoRequest\032\017.access.Se" +
      "ssion\"\000\0227\n\nGetSession\022\026.access.SessionRe",
      "quest\032\017.access.Session\"\000B-\n\022org.spin.grp" +
      "c.utilB\017ADempiereAccessP\001\242\002\003HLWb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_access_LoginRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_access_LoginRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_access_LoginRequest_descriptor,
        new java.lang.String[] { "UserName", "UserPass", "RoleUuid", "OrganizationUuid", "WarehouseUuid", "ClientVersion", "Language", });
    internal_static_access_LogoutRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_access_LogoutRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_access_LogoutRequest_descriptor,
        new java.lang.String[] { "SessionUuid", "Language", "ClientVersion", });
    internal_static_access_SessionRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_access_SessionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_access_SessionRequest_descriptor,
        new java.lang.String[] { "SessionUuid", "ClientVersion", });
    internal_static_access_ChangeRoleRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_access_ChangeRoleRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_access_ChangeRoleRequest_descriptor,
        new java.lang.String[] { "SessionUuid", "RoleUuid", "OrganizationUuid", "WarehouseUuid", "Language", "ClientVersion", });
    internal_static_access_UserInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_access_UserInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_access_UserInfoRequest_descriptor,
        new java.lang.String[] { "SessionUuid", "RoleUuid", "OrganizationUuid", "WarehouseUuid", "Language", "ClientVersion", });
    internal_static_access_UserInfoValue_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_access_UserInfoValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_access_UserInfoValue_descriptor,
        new java.lang.String[] { "UserInfo", "Roles", });
    internal_static_access_UserInfo_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_access_UserInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_access_UserInfo_descriptor,
        new java.lang.String[] { "Id", "Uuid", "Name", "Description", "Comments", });
    internal_static_access_Session_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_access_Session_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_access_Session_descriptor,
        new java.lang.String[] { "Id", "Uuid", "Name", "UserInfo", "Role", "Processed", "DefaultContext", });
    internal_static_access_Session_DefaultContextEntry_descriptor =
      internal_static_access_Session_descriptor.getNestedTypes().get(0);
    internal_static_access_Session_DefaultContextEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_access_Session_DefaultContextEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_access_ContextValue_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_access_ContextValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_access_ContextValue_descriptor,
        new java.lang.String[] { "IntValue", "LongValue", "DoubleValue", "BooleanValue", "StringValue", "ValueType", });
    internal_static_access_Role_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_access_Role_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_access_Role_descriptor,
        new java.lang.String[] { "Id", "Uuid", "Name", "Description", "ClientId", "ClientName", "IsCanReport", "IsCanExport", "IsPersonalLock", "IsPersonalAccess", "Organizations", "Windows", "Process", "Forms", "Browsers", "Workflows", "Tasks", "Dashboards", "DocumentActions", "Tables", "Columns", "Records", });
    internal_static_access_Access_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_access_Access_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_access_Access_descriptor,
        new java.lang.String[] { "Uuid", "IsReadOnly", "Action", });
    internal_static_access_TableAccess_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_access_TableAccess_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_access_TableAccess_descriptor,
        new java.lang.String[] { "TableName", "IsExclude", "IsCanReport", "IsCanExport", "AccessTypeRules", });
    internal_static_access_ColumnAccess_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_access_ColumnAccess_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_access_ColumnAccess_descriptor,
        new java.lang.String[] { "TableName", "ColumnName", "IsExclude", "IsReadOnly", });
    internal_static_access_RecordAccess_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_access_RecordAccess_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_access_RecordAccess_descriptor,
        new java.lang.String[] { "TableName", "RecordId", "RecordUuid", "IsExclude", "IsReadOnly", "IsDependentEntities", });
    internal_static_access_Menu_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_access_Menu_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_access_Menu_descriptor,
        new java.lang.String[] { "Id", "Uuid", "ParentUuid", "Name", "Description", "Sequence", "IsReadOnly", "IsSummary", "IsSOTrx", "Action", "ReferenceUuid", "Childs", "IsActive", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
