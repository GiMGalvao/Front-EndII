package com.example.ClinicaOdontologica.security;

<<<<<<< HEAD
import com.example.ClinicaOdontologica.repository.impl.DentistaServiceImpl;
import com.example.ClinicaOdontologica.repository.impl.PacienteServiceImpl;
=======
import com.example.ClinicaOdontologica.service.impl.DentistaServiceImpl;
import com.example.ClinicaOdontologica.service.impl.PacienteServiceImpl;
import io.jsonwebtoken.Claims;
>>>>>>> 195489bf3aa125d384774c08dc0f9b16a9bce7a4
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
<<<<<<< HEAD
=======
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
>>>>>>> 195489bf3aa125d384774c08dc0f9b16a9bce7a4
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@AllArgsConstructor
public class JwtRequestFilter extends OncePerRequestFilter {

    @Autowired
    private DentistaServiceImpl dentistaService;

    @Autowired
    PacienteServiceImpl pacienteService;

    @Autowired
    private JwtService jwtService;

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain) throws ServletException, IOException {

        String authorizationHeader = request.getHeader("Authorization");

        if(authorizationHeader != null &&  authorizationHeader.startsWith("Bearer")) {
            String token = authorizationHeader.substring(7);
            boolean isValid = jwtService.tokenValido(token);

            if (isValid) {
                String loginUsuario = jwtService.obterLoginUsuario(token);



                UserDetails usuario = dentistaService.loadUserByUsername(loginUsuario);

                if(usuario == null) {
                    usuario = pacienteService.loadUserByUsername(loginUsuario);
                }

                UsernamePasswordAuthenticationToken user = new
                        UsernamePasswordAuthenticationToken(usuario, null, usuario.getAuthorities());

                user.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(user);
            }
        }
        filterChain.doFilter(request, response);
    }
}
