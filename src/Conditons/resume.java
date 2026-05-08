import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

 class ResumeAnalyzerGUI extends JFrame {

    JTextArea outputArea;
    JButton uploadButton;
    JLabel titleLabel;
    JComboBox<String> roleSelector;

    public ResumeAnalyzerGUI() {

        // 🪟 Frame
        setTitle("Smart Resume Analyzer");
        setSize(700, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // 🎨 Main Panel
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(30, 30, 30));

        // 🏷 Title
        titleLabel = new JLabel("Smart Resume Analyzer", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.WHITE);

        // 🎯 Role Selector
        String[] roles = {"Frontend", "Backend", "Full Stack", "DevOps", "AI/ML"};
        roleSelector = new JComboBox<>(roles);
        roleSelector.setFont(new Font("Arial", Font.BOLD, 14));

        // 🔝 Top Panel
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(new Color(30, 30, 30));
        topPanel.add(titleLabel, BorderLayout.CENTER);
        topPanel.add(roleSelector, BorderLayout.EAST);

        // 🔘 Button
        uploadButton = new JButton("Upload Resume (.txt)");
        uploadButton.setFont(new Font("Arial", Font.BOLD, 14));
        uploadButton.setBackground(new Color(0, 150, 255));
        uploadButton.setForeground(Color.WHITE);

        // 📄 Output
        outputArea = new JTextArea();
        outputArea.setFont(new Font("Consolas", Font.PLAIN, 14));
        outputArea.setBackground(new Color(45, 45, 45));
        outputArea.setForeground(Color.GREEN);
        outputArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(outputArea);

        // 📦 Layout
        panel.add(topPanel, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(uploadButton, BorderLayout.SOUTH);

        add(panel);

        // 🎯 Action
        uploadButton.addActionListener(e -> uploadAndAnalyze());

        setVisible(true);
    }

    // 📂 File Upload
    private void uploadAndAnalyze() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();

            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                StringBuilder content = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    content.append(line.toLowerCase()).append(" ");
                }
                reader.close();

                analyzeResume(content.toString());

            } catch (Exception ex) {
                outputArea.setText("❌ Error reading file!");
            }
        }
    }

    // 🧠 Analysis Logic
    private void analyzeResume(String resume) {

        String selectedRole = roleSelector.getSelectedItem().toString();
        String[] skills;

        // 🎯 Role-Based Skills
        if (selectedRole.equals("Frontend")) {
            skills = new String[]{
                    "html", "css", "javascript", "react", "angular", "vue", "tailwind", "bootstrap"
            };
        }
        else if (selectedRole.equals("Backend")) {
            skills = new String[]{
                    "java", "python", "node", "express", "spring", "spring boot", "django",
                    "sql", "mongodb", "api", "rest api"
            };
        }
        else if (selectedRole.equals("Full Stack")) {
            skills = new String[]{
                    "html", "css", "javascript", "react",
                    "node", "express", "java", "spring",
                    "sql", "mongodb", "git"
            };
        }
        else if (selectedRole.equals("DevOps")) {
            skills = new String[]{
                    "docker", "kubernetes", "aws", "azure", "gcp",
                    "ci/cd", "jenkins", "terraform", "ansible", "linux", "shell scripting"
            };
        }
        else { // AI/ML
            skills = new String[]{
                    "python", "machine learning", "deep learning", "tensorflow",
                    "pytorch", "data science", "numpy", "pandas", "matplotlib",
                    "nlp", "artificial intelligence"
            };
        }

        List<String> found = new ArrayList<>();
        List<String> missing = new ArrayList<>();

        // 🔍 Skill Detection
        for (String skill : skills) {
            if (resume.contains(skill)) {
                found.add(skill);
            } else {
                missing.add(skill);
            }
        }

        // 📊 Score Calculation
        int score = (found.size() * 100) / skills.length;

        // 🖥 Output
        StringBuilder result = new StringBuilder();

        result.append("===== ANALYSIS RESULT =====\n\n");
        result.append("🎯 Role Selected: ").append(selectedRole).append("\n\n");

        result.append("✅ Skills Found:\n").append(found).append("\n\n");
        result.append("❌ Missing Skills:\n").append(missing).append("\n\n");

        result.append("📊 Resume Score: ").append(score).append("%\n");
        result.append("🔍 Total Skills Detected: ").append(found.size()).append("\n\n");

        result.append("💡 Suggestions:\n");

        if (score < 40) {
            result.append("- Add more relevant skills for ").append(selectedRole).append("\n");
            result.append("- Build projects in this domain\n");
        } else if (score < 70) {
            result.append("- Improve skill depth\n");
            result.append("- Add certifications or real-world experience\n");
        } else {
            result.append("- Strong profile for ").append(selectedRole).append("\n");
            result.append("- Start applying for internships/jobs\n");
        }

        outputArea.setText(result.toString());
    }

    public static void main(String[] args) {
        new ResumeAnalyzerGUI();
    }
}