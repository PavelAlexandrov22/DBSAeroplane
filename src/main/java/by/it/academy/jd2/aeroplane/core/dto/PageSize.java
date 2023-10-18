package by.it.academy.jd2.aeroplane.core.dto;

import java.util.Objects;

public class PageSize {

    private Integer page;

    private Integer size;

    public PageSize() {
    }

    public PageSize(Integer page, Integer size) {
        this.page = page;
        this.size = size;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PageSize pageSize = (PageSize) o;

        if (!Objects.equals(page, pageSize.page)) return false;
        return Objects.equals(size, pageSize.size);
    }

    @Override
    public int hashCode() {
        int result = page != null ? page.hashCode() : 0;
        result = 31 * result + (size != null ? size.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PageSize{" +
                "page=" + page +
                ", size=" + size +
                '}';
    }
}
