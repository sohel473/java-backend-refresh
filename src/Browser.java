public class Browser {
    public void navigate(String url) {
        String ip = findIpAddress(url);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    private String sendHttpRequest(String ip) {
        return "<html></html>";
    }

    private String findIpAddress(String url) {
        return "127.0.0.1";
    }
}
