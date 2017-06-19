/**
 * Clase MenuController.java 16-06-2017
 * Copyright 2017 Toro Software.
 * Todos los derechos reservados.
 */
package com.inventory.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

import com.inventory.entity.Menu;
import com.inventory.service.MenuService;

/**
 * @author Hp
 *
 */
@ManagedBean(name = "menuController")
@ViewScoped
public class MenuController {
	@EJB
	private MenuService menuService;
	private List<Menu> menus;
    private MenuModel model;
    
    String username, hostname, migasPan;

    @PostConstruct
    public void init() {
        this.obtenerMenus();
        this.model = new DefaultMenuModel();
        establecerPermisos();
    }

    public void obtenerMenus() {
        menus = menuService.findAll();
    }

    public void establecerPermisos() {
        //Usuario us = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
        for (Menu m : menus) {
        	//if (m.getTipoMenu().equals("S") && m.getTipoUsuario().equals(us.getTipo())) {
            if (m.getTipoMenu().equals("S")) {
                DefaultSubMenu firstSubmenu = new DefaultSubMenu(m.getNombre());
                for (Menu i : menus) {
                    Menu submenu = i.getCodigoMenu();
                    if (submenu != null) {
                        if (submenu.getCodigo() == m.getCodigo()) {
                            DefaultMenuItem item = new DefaultMenuItem(i.getNombre());
                            item.setUrl(i.getUrl());
                            item.setIcon(i.getIcono());
                            firstSubmenu.addElement(item);
                        }
                    }
                }
                model.addElement(firstSubmenu);
            } else {
                //if (m.getCodigoMenu() == null && m.getTipoUsuario().equals(us.getTipo())) {
            	if (m.getCodigoMenu() == null) {
                    DefaultMenuItem item = new DefaultMenuItem(m.getNombre());
                    item.setUrl(m.getUrl());
                    item.setIcon(m.getIcono());
                    model.addElement(item);
                }

            }
        }
    }
    
    public void cerrarSesion() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public MenuModel getModel() {
        return model;
    }

    public void setModel(MenuModel model) {
        this.model = model;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getMigasPan() {
        return migasPan;
    }

    public void setMigasPan(String migasPan) {
        this.migasPan = migasPan;
    }

}