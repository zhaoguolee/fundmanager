package com.puyitou.fundmanager.hedge.system.email;

import java.util.Map;

public interface MailService {

	void sendTemplateMail(String template, String recipient, String subject, Map<String, Object> params);

	void sendHtmlMail(String recipient, String subject, String emailContent);

}
