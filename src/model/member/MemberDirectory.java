/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.member;

import java.util.ArrayList;
import model.Enterprise.Enterprise;
import model.Enterprise.MemberEnterprise;

/**
 *
 * @author yuujadz
 */
public class MemberDirectory {
    
    private ArrayList<Member> memberList;
    private Enterprise enterprise;

    public MemberDirectory(Enterprise enterprise) {
        this.memberList = new ArrayList<Member>();
        this.enterprise = enterprise;
    }

    public ArrayList<Member> getAnimalList() {
        return memberList;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }
    
    public Member createMember(String name){
        Member member = new Member(name);
        member.setEnterprise((MemberEnterprise) enterprise);
        member.setId(memberList.size()+1);
        memberList.add(member); 
        return member;
    }
    
    public boolean nameIsUnique(String name){
        for(Member animal : memberList){
            if(name.equalsIgnoreCase(animal.getName())){
                return false;
            }
        }
        return true;
    }
}
