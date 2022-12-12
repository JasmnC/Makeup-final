/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import model.member.MemberDirectory;

/**
 *
 * @author yuujadz
 */
public class MemberEnterprise extends Enterprise {
    
    private MemberDirectory memberDirectory;

    public MemberEnterprise(String name) {
        super(name, Enterprise.Type.MemberEnterprise);
        memberDirectory = new MemberDirectory(this);
    }

    public MemberDirectory getMemberDirectory() {
        return memberDirectory;
    }

    public void setMemberDirectory(MemberDirectory memberDirectory) {
        this.memberDirectory = memberDirectory;
    }
    
}