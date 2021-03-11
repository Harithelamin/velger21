import { User } from "./user";

export class UserProfile {
    id: number;
    createdDate: Date;
    modifiedDate: Date;
    createdBy: User;
    modifiedBy: User;
    fullName: String;
    email: String;
    mobileNo: String;
    isEnabled: boolean;
}