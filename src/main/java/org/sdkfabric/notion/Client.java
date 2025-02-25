/**
 * Client automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.notion;

import app.sdkgen.client.ClientAbstract;
import app.sdkgen.client.Credentials.*;
import app.sdkgen.client.CredentialsInterface;
import app.sdkgen.client.Exception.Authenticator.InvalidCredentialsException;
import app.sdkgen.client.Exception.ClientException;
import app.sdkgen.client.Exception.UnknownStatusCodeException;
import app.sdkgen.client.Parser;
import app.sdkgen.client.TokenStoreInterface;
import com.fasterxml.jackson.core.type.TypeReference;
import org.apache.hc.client5.http.classic.methods.*;
import org.apache.hc.client5.http.entity.UrlEncodedFormEntity;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.io.entity.*;
import org.apache.hc.core5.net.URIBuilder;
import org.apache.hc.core5.net.URLEncodedUtils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client extends ClientAbstract {
    public Client(String baseUrl, CredentialsInterface credentials) throws InvalidCredentialsException {
        super(baseUrl, credentials);
    }

    public UserTag user()
    {
        return new UserTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public DatabaseTag database()
    {
        return new DatabaseTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public PageTag page()
    {
        return new PageTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }



    public static Client build(String token) throws InvalidCredentialsException
    {
        return new Client("https://api.notion.com", new HttpBearer(token));
    }

    public static Client buildAnonymous() throws InvalidCredentialsException
    {
        return new Client("https://api.notion.com", new Anonymous());
    }
}
