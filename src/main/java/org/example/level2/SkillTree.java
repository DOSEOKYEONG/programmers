package org.example.level2;

public class SkillTree {
    // https://school.programmers.co.kr/learn/courses/30/lessons/49993
    // 스킬트리

    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String s : skill_trees) {
            String str = s.replaceAll("[^" + skill + "]", "");
            if (skill.substring(0, str.length()).equals(str)) {
                answer++;
            }
        }

        return answer;
    }
}
