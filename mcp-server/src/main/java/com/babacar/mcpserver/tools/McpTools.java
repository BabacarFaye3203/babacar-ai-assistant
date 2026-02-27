package net.babacar.mcpserver.tools;

import org.springaicommunity.mcp.annotation.McpArg;
import org.springaicommunity.mcp.annotation.McpTool;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class McpTools {

    @McpTool(description = "Get Babacar Faye full professional profile")
    public Profile getProfile() {
        return new Profile(
                "Babacar Faye",
                "Full Stack & AI Developer",
                "Beni Mellal, Morocco",
                "bf322003@gmail.com",
                List.of(
                        "Java", "Spring Boot", "Spring Security",
                        "Angular", "Microservices",
                        "Machine Learning", "Deep Learning",
                        "Docker", "AWS", "PostgreSQL",
                        "DevOps", "Cloud Computing", "MLOps",
                        "Python", "Data Analysis", "AI System Design",
                        "JavaScript", "PHP", "SQL Server", "MySQL"
                ),
                List.of(
                        "Backend Java/Spring Boot Developer at CodingArt",
                        "Full Stack Java/Angular Intern",
                        "Executive Regional Secretary-General UGESM",
                        "Production Assistant at CIRCET Morocco",
                        "Acoustics Technician at FOTECMA",
                        "Compateur d'offres SFR at Right Place Call Morocco"
                ),
                List.of(
                        "Master’s in Artificial Intelligence & Digital Computing",
                        "Bachelor’s degree in Computer Science (with honors)",
                        "DEUST Mathematics-Informatics"
                ),
                List.of(
                        "Sécurisez votre application web avec Spring Security – OpenClassrooms (May 2025, ID: 3679087444)",
                        "Apprenez à programmer en Java – OpenClassrooms (Mar 2025, ID: 3022533627)",
                        "Gérez du code avec Git et GitHub – OpenClassrooms (Apr 2025, ID: 2370910875)",
                        "Optimisez votre déploiement en créant des conteneurs avec Docker – OpenClassrooms (Mar 2025, ID: 7478213417)",
                        "Débutez avec Angular – OpenClassrooms (Mar 2025, ID: 9008292471)",
                        "Adoptez les API REST pour vos projets web – OpenClassrooms (Mar 2025, ID: 1730919284)",
                        "Créez une application Java avec Spring Boot – OpenClassrooms (Mar 2025, ID: 2191954104)",
                        "Devenez développeur agile – OpenClassrooms (Mar 2025, ID: 7960728263)",
                        "Concevez votre réseau TCP/IP – OpenClassrooms (Dec 2024, ID: 7705792721)",
                        "Développez des sites web avec Java EE – OpenClassrooms (Feb 2025, ID: 2163735445)",
                        "Utilisez Spring Data pour interagir avec vos bases de données – OpenClassrooms (Mar 2025, ID: 7068659783)",
                        "Complétez vos connaissances sur Angular – OpenClassrooms (Apr 2025, ID: 2812962133)",
                        "Concevez votre site web avec PHP et MySQL – OpenClassrooms (Apr 2025, ID: 7183939526)",
                        "Python programming – Alison",
                        "L'essentiel de JavaScript – LinkedIn Learning (Mar 2024)"
                ),
                "Build scalable AI-driven SaaS platforms and become an expert in AI & Cloud systems."
        );
    }

    @McpTool(description = "Get Babacar's technical skills")
    public List<String> getSkills() {
        return List.of(
                "Java", "Spring Boot", "Spring Security",
                "Angular", "Microservices",
                "Machine Learning", "Deep Learning",
                "Docker", "AWS", "PostgreSQL",
                "DevOps", "Cloud Computing", "MLOps",
                "Python", "Data Analysis", "AI System Design",
                "JavaScript", "PHP", "SQL Server", "MySQL"
        );
    }

    @McpTool(description = "Get Babacar's career goal")
    public String getCareerGoal() {
        return "Become a leading expert in AI-powered SaaS and Cloud systems, delivering scalable solutions and AI-driven automation.";
    }

    @McpTool(description = "Generate a professional summary about Babacar")
    public String generateProfessionalSummary() {
        return """
            Babacar Faye is a Full Stack & AI Developer with expertise in
            Java, Spring Boot, Microservices, and Machine Learning.
            He is currently pursuing a Master’s degree in Artificial Intelligence & Digital Computing,
            and specializes in building scalable AI SaaS platforms, cloud architectures, and DevOps practices.
            """;
    }

    @McpTool(description = "Generate a recruiter pitch for Babacar")
    public String recruiterPitch() {
        return """
            I am Babacar Faye, a Full Stack & AI Developer with strong backend expertise
            in Spring Boot, microservices, and cloud computing.
            I specialize in AI, MLOps, and building scalable SaaS solutions.
            I am passionate about bridging AI with enterprise-grade software architectures.
            """;
    }

    @McpTool(description = "Detect greeting and respond appropriately")
    public String handleGreeting(@McpArg(description = "User message") String message) {
        String lower = message.toLowerCase();

        if (lower.matches(".*\\b(bonjour|salut|hello|hi|bonsoir)\\b.*")) {
            return """
                👋 Bonjour !

                Je suis Babacar AI, votre assistant personnel spécialisé :

                • Full Stack & Microservices (Java, Spring Boot, Angular)
                • Intelligence Artificielle et Machine Learning
                • Cloud Computing et DevOps
                • AI-driven SaaS architectures

                Comment puis-je vous aider aujourd’hui ?
                """;
        }

        return "Je ne suis pas sûr de comprendre, peux-tu reformuler ?";
    }

    @McpTool(description = "Quick introduction about Babacar AI")
    public String quickIntro() {
        return """
            Salut ! Je suis Babacar AI 🤖
            Assistant Full Stack & AI Developer, spécialisé en :
            • Java / Spring Boot / Angular
            • Machine Learning / Deep Learning
            • Cloud / DevOps / MLOps
            Je peux t'aider à découvrir mes compétences, mon parcours ou répondre à tes questions techniques.
            """;
    }
}

record Profile(
        String name,
        String title,
        String location,
        String email,
        List<String> skills,
        List<String> experiences,
        List<String> education,
        List<String> certifications,
        String careerGoal
) {}