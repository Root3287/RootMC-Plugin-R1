package com.rootmc.timothy.RootMC.main.messages;

import com.rootmc.timothy.RootMC.main.Roles;

public class RolesMessage{
	static Roles roles;
	static String permissionError;
	static String RoleSTRING;
	public RolesMessage(Roles roles){
		RolesMessage.roles = roles;
	}
	
	public String permissionError(){
		switch(RolesMessage.roles){
			case OWNER:
				 RolesMessage.permissionError = MainFormat.Format("Permission","This is an OWNER Operation Only!");
				break;
			case ADMIN:
				RolesMessage.permissionError=MainFormat.Format("Permission","This is an ADMIN Operation!");
				break;
			case MOD:
				RolesMessage.permissionError= MainFormat.Format("Permission","This is an MODERATOR Operation!");
				break;
			case IRON:
				RolesMessage.permissionError = MainFormat.Format("Permission","This is not operable yet!");
				break;
			case COAL:
				RolesMessage.permissionError = MainFormat.Format("Permission","This is not operable yet!");
				break;
			case DONOR:
				RolesMessage.permissionError = MainFormat.Format("Permission","This is not operable yet!");
				break;
		default:
			RolesMessage.permissionError = MainFormat.Format("Permission", "Your in  a unknown permission please contact an administrator!");
			break;
		}
		return RolesMessage.permissionError;
	}
	
	public String RoleSTRING(){
		switch(RolesMessage.roles){
		case OWNER:
			 RolesMessage.RoleSTRING = "Owner";
			break;
		case ADMIN:
			RolesMessage.RoleSTRING="Admin";
			break;
		case MOD:
			RolesMessage.RoleSTRING= "MODERATOR";
			break;
		case IRON:
			RolesMessage.RoleSTRING= "IRON";
			break;
		case COAL:
			RolesMessage.RoleSTRING = "Coal";
			break;
		case DONOR:
			RolesMessage.RoleSTRING = "DONOR";
			break;
		case MEMBER:
			RolesMessage.RoleSTRING = "Member";
	default:
		RolesMessage.RoleSTRING = "MEMBER";
		break;
	}
		return RolesMessage.RoleSTRING;
	}
	
}
